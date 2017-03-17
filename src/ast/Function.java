package ast;

import exceptions.VarExistante;
import intermediate.Intermediate;
import main.StringOffseter;
import table.FunctionIdentificateur;
import table.Table;
import table.VarIdentificateur;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alistarle on 07/03/2017.
 */
public class Function extends Ast{

    public Declaration ret;
    public String id;
    public List<Declaration> params;
    public List<Instruction> ins;
    public Type.EnumType type;

    public Function(Position pos, Declaration ret, List<Instruction> ins, ArrayList<Declaration> params, String id, Type.EnumType type) {
        this.pos = pos;
        this.ret = ret;
        this.ins = ins;
        this.params = params;
        this.id = id;
        this.type = type;
    }

    public boolean retIsNull(){
        return ret == null;
    }

    public String toString() {
        StringOffseter s = new StringOffseter(type.toString() + " " + id +"(");
        for(Declaration entry : params){
            s.appendNoOffset(entry.toString() + ",");
        }
        //remove the last ","
        if(params.size() > 0) s.getBuilder().deleteCharAt(s.getBuilder().length()-1);
        s.appendNoOffset("){\n");

        StringOffseter.offset++;
        for(Instruction i: ins){
            String semicolon = (i instanceof Control)? "" : ";";
            s.append(i.toString() + semicolon + "\n");
        }
        StringOffseter.offset--;

        s.append("}");

        return s.toString();
    }

    public void insertIntoTable() throws Exception{
        Type.EnumType t = Table.getInstance().lookUp(id,true);
        if(t == null) {
            FunctionIdentificateur fId = new FunctionIdentificateur(type, id);

            for(Declaration entry : params){
                System.out.println("On ajoute les paramètres :"+entry.getId());
                entry.setIndex(Intermediate.fresh_reg());
                if(entry.getT().isRef())
                    fId.addRef(entry.getT(), entry.getId());
                else
                    fId.addVal(entry.getT(), entry.getId());
                VarIdentificateur vId = new VarIdentificateur(entry.getT(),entry.getId(),entry.getIndex());
                Table.getInstance().addTopBlock(vId, false);
            }

            Table.getInstance().addTopBlock(fId, true);
        }else {
            throw new VarExistante(id,pos);
        }
    }

    @Override
    public void verifSemantique() throws Exception {
        insertIntoTable();
        Type.EnumType type = Table.getInstance().lookUp(id,true);

        for(Instruction i:ins){
            i.verifSemantique();
        }

        System.out.println("=========== Affichage de la table des symbole ===========");
        System.out.println(Table.getInstance().toString());
        Table.getInstance().popBlock();
    }
}
