package ast;

import java.util.ArrayList;

/**
 * Created by alistarle on 29/03/2017.
 */
public class Skip extends Instruction {

    public Skip() { super(); }

    @Override
    public ArrayList<intermediate.Instruction> genIntermediate() {
        return new ArrayList<>();
    }

    @Override
    public void verifSemantique() throws Exception { }

    @Override
    public String toString() {
        return "Skip";
    }
}
