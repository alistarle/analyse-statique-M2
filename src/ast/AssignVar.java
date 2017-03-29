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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new AssignVar(pos, var, exp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssignVar)) return false;

        AssignVar assignVar = (AssignVar) o;

        if (reg_index != assignVar.reg_index) return false;
        if (var != null ? !var.equals(assignVar.var) : assignVar.var != null) return false;
        return exp != null ? exp.equals(assignVar.exp) : assignVar.exp == null;

    }

    @Override
    public int hashCode() {
        int result = var != null ? var.hashCode() : 0;
        result = 31 * result + reg_index;
        result = 31 * result + (exp != null ? exp.hashCode() : 0);
        return result;
    }
}
