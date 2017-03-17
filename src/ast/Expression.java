package ast;

/**
 * Created by alistarle on 07/03/2017.
 */
public abstract class Expression extends Ast {
    abstract public Type.EnumType getType() throws Exception;
}
