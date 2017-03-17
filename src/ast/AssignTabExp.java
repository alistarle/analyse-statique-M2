package ast;

import exceptions.ReferenceIndefinie;
import exceptions.TypeIncoherent;
import table.Table;

import java.util.ArrayList;

/**
 * Created by alistarle on 07/03/2017.
 */
public class AssignTabExp extends Instruction{

    public String nameTab;
    public Expression expParam;
    public int reg_index;
    public Expression exp;

    public AssignTabExp(Position pos, String nameTab, Expression expParam, Expression exp) {
        this.pos = pos;
        this.nameTab = nameTab;
        this.expParam = expParam;
        this.exp = exp;
    }

    public String toString(){
        return nameTab + "[" + expParam.toString() + "] = " + exp.toString();
    }


    @Override
    public ArrayList<intermediate.Instruction> genIntermediate() {
        return null;
    }

    @Override
    public void verifSemantique() throws Exception {
        Type.EnumType t = Table.getInstance().lookUp(nameTab,false);
        if(t==null){
            throw new ReferenceIndefinie(nameTab,pos);
        }else{
            if(expParam.getType() != Type.EnumType.INTVAL){
                throw new TypeIncoherent(expParam.getType().toString(), "int",pos);
            }else {
                if(exp.getType() != t){
                    throw new TypeIncoherent(exp.getType().toString(),t.toString(),pos);
                }
            }
        }
        this.reg_index = Table.getInstance().lookUpIndex(nameTab);
    }
}
