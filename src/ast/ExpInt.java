package ast;

import java.util.HashSet;

/**
 * Created by alistarle on 07/03/2017.
 */
public class ExpInt extends Expression {
    public int value;
    public ExpInt(Position pos, int value){
        this.pos = pos;
        this.value = value;
    }
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public Type.EnumType getType() throws Exception {
        return Type.EnumType.INTVAL;
    }

    @Override
    public HashSet<Declaration> getVar() {
        return new HashSet<>();
    }

    @Override
    public void verifSemantique() throws Exception {

    }
}
