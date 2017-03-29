package ast;

import java.util.HashSet;

/**
 * Created by alistarle on 07/03/2017.
 */
public class ExpBool extends Expression {
    public Bool value;
    public ExpBool(Position pos, Bool value){
        this.pos = pos;
        this.value = value;
    }
    public String toString() {
        return value.toString();
    }

    @Override
    public Type.EnumType getType() {
        return Type.EnumType.BOOLVAL;
    }

    @Override
    public HashSet<Declaration> getVar() {
        return new HashSet<>();
    }

    @Override
    public void verifSemantique() throws Exception {

    }
}
