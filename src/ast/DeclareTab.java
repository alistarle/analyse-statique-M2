package ast;

import exceptions.TypeIncoherent;
import exceptions.VarExistante;
import intermediate.Instruction;
import intermediate.Intermediate;
import table.Table;
import table.VarIdentificateur;

import java.util.ArrayList;

/**
 * Created by alistarle on 07/03/2017.
 */
public class DeclareTab extends Declaration {

    public Type.EnumType t;
    public String id;
    public Expression size;

    public DeclareTab(Position pos, Type.EnumType t, Expression size, String id) {
        this.pos = pos;
        this.t = t;
        this.size = size;
        this.id = id;
    }

    public String toString(){
        return t.toString() + " " + id + "[" + size.toString() + "]";
    }

    public void insertIntoTable() throws Exception{
        Type.EnumType t = Table.getInstance().lookUp(id,false);
        if(t == null) {
            VarIdentificateur varIdentificateur = new VarIdentificateur(this.t, id, Intermediate.fresh_reg());
            Table.getInstance().addTopBlock(varIdentificateur, isGlobal);
        }else{
            throw new VarExistante(id,pos);
        }
    }

    @Override
    public void verifSemantique() throws Exception {
        insertIntoTable();
        if(size.getType() != Type.EnumType.INTVAL){
            throw new TypeIncoherent(size.toString(), "int",pos);
        }
    }

    @Override
    public ArrayList<Instruction> genIntermediate() {
        //TODO Gen declaration of array
        return null;
    }
}
