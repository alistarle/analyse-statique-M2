package ast;

/**
 * Created by alistarle on 07/03/2017.
 */
public abstract class Declaration extends Instruction implements Cloneable {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new DeclareVar(this.pos, this.t, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Declaration that = (Declaration) o;

        return id != null ? id.equals(that.id) : that.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
