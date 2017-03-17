package ast;

/**
 * Created by alistarle on 07/03/2017.
 */
public abstract class Declaration extends Instruction{

    public boolean isGlobal = false;

    public Type.EnumType t;
    public int reg_index;
    public String id;

    public Type.EnumType getT() {
        return t;
    }

    public String getId() {
        return id;
    }

    public int getIndex() {
        return reg_index;
    }

    public void setIndex(int reg_index) {
        this.reg_index = reg_index;
    }

}
