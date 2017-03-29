package ast;

import analysis.utils.Pair;
import exceptions.TypeIncoherent;
import intermediate.Intermediate;
import intermediate.instruction.Goto;
import intermediate.instruction.Jump;
import intermediate.instruction.Label;
import main.StringOffseter;
import table.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by alistarle on 07/03/2017.
 */
public class ControlIf extends Control {

    public List<Instruction> lif;
    public List<Instruction> lelse;

    public ControlIf(Position pos,Expression exp, List<Instruction> lif, List<Instruction> lelse) {
        super();
        this.pos = pos;
        this.exp = exp;
        this.lif = lif;
        this.lif.add(new Skip());
        this.lelse = lelse;
        this.lelse.add(new Skip());
    }

    public String toString() {
        StringOffseter s = new StringOffseter("if("+exp.toString()+"){\n", false);
        StringOffseter.offset++;
        for(Instruction i:lif){
            String semicolon = (i instanceof Control)? "" : ";";
            s.append(i.toString() + semicolon + "\n");
        }
        StringOffseter.offset--;
        s.append("}");
        if(lelse.size() != 0){
            s.appendNoOffset("else{\n");
            StringOffseter.offset++;
            for(Instruction i:lelse){
                String semicolon = (i instanceof Control)? "" : ";";
                s.append(i.toString() + semicolon +"\n");
            }
            StringOffseter.offset--;
            s.append("}");
        }
        return s.toString();
    }

    @Override
    public HashMap<Integer, Instruction> getLabels()
    {
        HashMap<Integer, Instruction> list = new HashMap<>();
        for(Instruction ins : this.lif)
            list.putAll(ins.getLabels());
        for(Instruction ins : this.lelse)
            list.putAll(ins.getLabels());
        return list;
    }

    @Override
    public ArrayList<intermediate.Instruction> genIntermediate() {
        ArrayList<intermediate.Instruction> iList = new ArrayList<>();
        Label isTrue = new Label(Intermediate.fresh_lbl());
        Label isFalse = new Label(Intermediate.fresh_lbl());
        Label join = new Label(Intermediate.fresh_lbl());

        iList.add(new Jump(exp, isTrue, isFalse));

        iList.add(isTrue);
        for(Instruction instruction : lif)
        {
            iList.addAll(instruction.genIntermediate());
        }
        //Le join, on rajoute un label pour pouvoir le supprimer si il est inutilisé ensuite
        iList.add(new Label(Intermediate.fresh_lbl()));
        iList.add(new Goto(join));

        iList.add(isFalse);
        for(Instruction instruction : lelse)
        {
            iList.addAll(instruction.genIntermediate());
        }
        //Le join, on rajoute un label pour pouvoir le supprimer si il est inutilisé ensuite
        iList.add(new Label(Intermediate.fresh_lbl()));
        iList.add(new Goto(join));

        iList.add(join);
        return iList;
    }

    public HashSet<Pair> getFlow(Instruction next) {
        HashSet<Pair> flow = new HashSet<>();

        for(int i = 0; i < lif.size()-1; i++)
        {
            if(lif.get(i) instanceof ControlWhile)
            {
                flow.addAll(((ControlWhile) lif.get(i)).getFlow());
            } else if(lif.get(i) instanceof ControlIf) {
                flow.addAll(((ControlIf) lif.get(i)).getFlow(lif.get(i+1)));
            }
            flow.add(new Pair(lif.get(i).label, lif.get(i+1).label));
        }

        for(int i = 0; i < lelse.size()-1; i++)
        {
            if(lelse.get(i) instanceof ControlWhile)
            {
                flow.addAll(((ControlWhile) lelse.get(i)).getFlow());
            } else if(lelse.get(i) instanceof ControlIf) {
                flow.addAll(((ControlIf) lelse.get(i)).getFlow(lelse.get(i+1)));
            }
            flow.add(new Pair(lelse.get(i).label, lelse.get(i+1).label));
        }
        flow.add(new Pair(this.label, lif.get(0).label));
        flow.add(new Pair(this.label, lelse.get(0).label));
        flow.add(new Pair(lif.get(lif.size()-1).label, next.label));
        flow.add(new Pair(lelse.get(lif.size()-1).label, next.label));

        return flow;
    }

    @Override
    public void verifSemantique() throws Exception {
        if(exp.getType()!= Type.EnumType.BOOLVAL){
            throw new TypeIncoherent(exp.getType().toString(),"Boolean",pos);
        }

        Table.getInstance().newBlock();

        for(Instruction i:lif){
            i.verifSemantique();
        }

        for(Instruction i:lelse){
            i.verifSemantique();
        }
        Table.getInstance().popBlock();
    }
}
