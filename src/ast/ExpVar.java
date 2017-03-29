package ast;

import exceptions.ReferenceIndefinie;
import table.Table;

import java.util.HashSet;

/**
 * Created by alistarle on 07/03/2017.
 */
public class ExpVar extends Expression {

    //Flag use to tweak the toString function from name to regIndex
    public static boolean FLAG_REG = false;

    public String name;
    public int reg_index;

    public ExpVar(Position pos, String name){
        this.pos = pos;
        this.name = name;
    }

    public String toString() {
        if(FLAG_REG)
            return "reg"+reg_index;
        else
            return name;
    }

    @Override
    public Type.EnumType getType() throws Exception {
        Type.EnumType t = Table.getInstance().lookUp(name,false);
        if(t!=null){
            this.reg_index = Table.getInstance().lookUpIndex(name);
            return t;
        }else{
            throw new ReferenceIndefinie(name,pos);
        }
    }

    @Override
    public HashSet<Declaration> getVar() {
        HashSet<Declaration> list = new HashSet<>();
        list.add(new DeclareVar(this.pos, Type.EnumType.INTVAL, this.name));
        return list;
    }

    public int getIndex() {
        return reg_index;
    }

    @Override
    public void verifSemantique() throws Exception {
        getType();
    }
}
