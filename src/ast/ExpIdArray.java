package ast;

import exceptions.ReferenceIndefinie;
import exceptions.TypeIncoherent;
import table.Table;

/**
 * Created by alistarle on 07/03/2017.
 */
public class ExpIdArray extends Expression {

    public String id;
    public Expression exp;

    public ExpIdArray(Position pos, String id, Expression exp) {
        this.pos = pos;
        this.id = id;
        this.exp = exp;
    }

    public String toString() {
        return id + "[" + exp.toString() + "]";
    }


    @Override
    public Type.EnumType getType() throws Exception {
        if(exp.getType() != Type.EnumType.INTVAL){
            throw new TypeIncoherent(exp.getType().toString(),"int",pos);
        }else{
            Type.EnumType t = Table.getInstance().lookUp(id,false);
            if(t!=null){
                return t;
            }else{
                throw new ReferenceIndefinie(id,pos);
            }
        }
    }

    @Override
    public void verifSemantique() throws Exception {
        Type.EnumType t = Table.getInstance().lookUp(id,false);
        if(t == null){
            throw new ReferenceIndefinie(id,pos);
        }else if(exp.getType() != Type.EnumType.INTVAL) {
            throw new TypeIncoherent(exp.getType().toString(),"int",pos);
        }
        exp.verifSemantique();
    }
}
