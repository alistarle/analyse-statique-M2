package ast;

import exceptions.ReferenceIndefinie;
import table.Table;

import java.util.HashSet;

/**
 * Created by alistarle on 07/03/2017.
 */
public class ExpFunctionCall extends Expression{

    public FunctionCall fc;

    public ExpFunctionCall(Position pos, FunctionCall fc) {
        this.pos = pos;
        this.fc = fc;
    }

    @Override
    public Type.EnumType getType() throws Exception {
        Type.EnumType t = Table.getInstance().lookUp(fc.id,true);
        if(t!=null){
            return t;
        }else{
            throw new ReferenceIndefinie(fc.id,pos);
        }
    }

    @Override
    public HashSet<Declaration> getVar() {
        return new HashSet<>();
    }

    @Override
    public void verifSemantique() throws Exception {
        fc.verifSemantique();
    }
}
