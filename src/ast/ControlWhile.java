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
public class ControlWhile extends Control {

    public List<Instruction> ins;

    public ControlWhile(Position pos, Expression exp, List<Instruction> ins) {
        super();
        this.pos = pos;
        this.exp = exp;
        this.ins = ins;
        this.ins.add(new Skip());
    }

    public String toString() {
        StringOffseter s = new StringOffseter("while("+ exp.toString() +"){\n",false);
        StringOffseter.offset++;
        for (Instruction i : ins) {
            String semicolon = (i instanceof Control)? "" : ";";
            s.append(i.toString() + semicolon + "\n");
        }
        StringOffseter.offset--;
        s.append("}");
        return s.toString();
    }

    @Override
    public HashMap<Integer,Instruction> getLabels()
    {
        HashMap<Integer,Instruction> list = new HashMap<>();
        list.put(this.label, this);
        for(Instruction ins : this.ins)
            list.putAll(ins.getLabels());
        return list;
    }

    public HashSet<Pair> getFlow() {
        HashSet<Pair> flow = new HashSet<>();

        for(int i = 0; i < ins.size()-1; i++)
        {
            if(ins.get(i) instanceof ControlWhile)
            {
                flow.addAll(((ControlWhile) ins.get(i)).getFlow());
            } else if(ins.get(i) instanceof ControlIf) {
                flow.addAll(((ControlIf) ins.get(i)).getFlow(ins.get(i+1)));
            }
            flow.add(new Pair(ins.get(i).label, ins.get(i+1).label));
        }
        flow.add(new Pair(this.label, ins.get(0).label));
        flow.add(new Pair(ins.get(ins.size()-1).label, this.label));

        return flow;
    }

    @Override
    public ArrayList<intermediate.Instruction> genIntermediate() {

        ArrayList<intermediate.Instruction> iList = new ArrayList<>();
        Label test = new Label(Intermediate.fresh_lbl());
        Label loop = new Label(Intermediate.fresh_lbl());
        Label end = new Label(Intermediate.fresh_lbl());

        iList.add(test);
        iList.add(new Jump(exp, loop, end));

        iList.add(loop);
        for(Instruction instruction : ins)
        {
            iList.addAll(instruction.genIntermediate());
        }
        iList.add(new Goto(test));

        iList.add(end);
        return iList;
    }

    @Override
    public void verifSemantique() throws Exception {
        if(exp.getType()!= Type.EnumType.BOOLVAL){
            throw new TypeIncoherent(exp.getType().toString(),"Boolean",pos);
        }
        Table.getInstance().newBlock();

        for(Instruction i:ins){
            i.verifSemantique();
        }

        Table.getInstance().popBlock();
    }
}
