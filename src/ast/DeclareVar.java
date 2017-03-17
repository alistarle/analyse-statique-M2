package ast;

import exceptions.VarExistante;
import intermediate.Instruction;
import intermediate.Intermediate;
import intermediate.instruction.WriteReg;
import table.Table;
import table.VarIdentificateur;

import java.util.ArrayList;

/**
 * Created by alistarle on 07/03/2017.
 */
public class DeclareVar extends Declaration {

    public DeclareVar(Position pos, Type.EnumType t, String id) {
        this.pos = pos;
        this.t = t;
        this.id = id;
    }

    public String toString(){
        return t.toString() + " " + id;
    }

    @Override
    public ArrayList<Instruction> genIntermediate() {
        ArrayList<Instruction> iList = new ArrayList<>();
        iList.add(new WriteReg(reg_index, new ExpInt(null, 0)));
        return iList;
    }

    public void insertIntoTable() throws Exception{
        System.out.println("Insert into table :" + this.id);
        Type.EnumType ty = Table.getInstance().lookUp(id,false);
        if(ty == null) {
            this.reg_index = Intermediate.fresh_reg();
            VarIdentificateur varId = new VarIdentificateur(t, id, reg_index);
            Table.getInstance().addTopBlock(varId, isGlobal);
        }else{
            throw new VarExistante(id,pos);
        }
    }

    @Override
    public void verifSemantique() throws Exception {
        insertIntoTable();
    }
}
