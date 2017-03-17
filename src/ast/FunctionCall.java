package ast;

import exceptions.ReferenceIndefinie;
import intermediate.instruction.Label;
import table.FunctionIdentificateur;
import table.Table;

import java.util.ArrayList;

/**
 * Created by alistarle on 07/03/2017.
 */
public class FunctionCall extends Instruction {

    public String id;
    public ArrayList<Expression> params;

    public FunctionCall(Position pos,String id, ArrayList<Expression> params) {
        this.pos = pos;
        this.id = id;
        this.params = params;
    }

    public String toString() {
        StringBuilder s = new StringBuilder(id +"(");

        for(Expression i: params){
            s.append(i.toString() + ",");
        }

        //remove last ","
        s.deleteCharAt(s.length()-1);
        s.append(")");

        return s.toString();
    }

    @Override
    public ArrayList<intermediate.Instruction> genIntermediate() {
        ArrayList<intermediate.Instruction> iList = new ArrayList<>();
        iList.add(new intermediate.instruction.FunctionCall(new Label(Table.getInstance().getFunc(id).getIndex()), params));
        return iList;
    }

    @Override
    public void verifSemantique() throws Exception {
        if( !(id.equals("in") || id.equals("out"))){
            FunctionIdentificateur f = Table.getInstance().getFunc(id);
            //probleme parametres
            if (f == null) {
                throw new ReferenceIndefinie(id,pos);
            }
        }
    }
}
