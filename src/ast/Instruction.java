package ast;

import java.util.ArrayList;

/**
 * Created by alistarle on 07/03/2017.
 */
public abstract class Instruction extends Ast {
    public abstract ArrayList<intermediate.Instruction> genIntermediate();
}
