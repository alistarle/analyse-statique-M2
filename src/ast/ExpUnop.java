package ast;

import exceptions.TypeIncoherent;

import java.util.HashSet;

/**
 * Created by alistarle on 07/03/2017.
 */
public class ExpUnop extends Expression{
    public Expression right;
    public Unop op;
    public ExpUnop(Position pos, Expression right, Unop op) {
        this.pos = pos;
        this.right = right;
        this.op = op;
    }
    public String toString() {
        return op.toString() + right.toString();
    }

    @Override
    public Type.EnumType getType() throws Exception {
        if(op.toString().toUpperCase() == "!"){
            return Type.EnumType.BOOLVAL;
        }else {
            return right.getType();
        }
    }

    @Override
    public HashSet<Declaration> getVar() {
        return right.getVar();
    }

    @Override
    public void verifSemantique() throws Exception {
        //un seul binop : !
        if(getType() != Type.EnumType.BOOLVAL){
            throw new TypeIncoherent(getType().toString(),"boolean",pos);
        }
    }
}
