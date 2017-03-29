package ast;

import exceptions.ReferenceIndefinie;
import exceptions.TypeIncoherent;
import intermediate.instruction.WriteReg;
import table.Table;

import java.util.ArrayList;

/**
 * Created by alistarle on 07/03/2017.
 */
public class AssignVar extends Instruction{

    public String var;
    public int reg_index;
    public Expression exp;

    public AssignVar(Position pos, String var, Expression exp) {
        super();
        this.pos = pos;
        this.var = var;
        this.exp = exp;
    }

    public String toString() {
        return var + " = " + exp.toString();
    }

    @Override
    public ArrayList<intermediate.Instruction> genIntermediate() {
        ArrayList<intermediate.Instruction> iList = new ArrayList<>();
        iList.add(new WriteReg(reg_index, exp));
        return iList;
    }

    @Override
    public void verifSemantique() throws Exception {
        Type.EnumType type = Table.getInstance().lookUp(var, false);
        if(type == null){
            throw new ReferenceIndefinie(var,pos);
        }else if(type != exp.getType()){
            throw new TypeIncoherent(type.toString(),exp.getType().toString(),pos);
        }
        this.reg_index = Table.getInstance().lookUpIndex(var);
    }
}
