package ast;

import intermediate.*;
import intermediate.Instruction;
import intermediate.instruction.Label;
import table.FunctionIdentificateur;

import java.util.ArrayList;

/**
 * Created by alistarle on 08/03/2017.
 */
public class Reserver extends ast.Instruction {

    public enum Function {
        IN(new FunctionIdentificateur(Type.EnumType.INTVAL, "in")),
        OUT(new FunctionIdentificateur(Type.EnumType.VOIDVAL, "out"));

        private FunctionIdentificateur fi;

        Function(FunctionIdentificateur fi){
            fi.setIndex(Intermediate.fresh_lbl());
            this.fi = fi;
        }

        public FunctionIdentificateur getFi() { return fi; }

        public Label getLabel(){
            return new Label(fi.getIndex());
        }
    }

    public Function var;

    public Reserver(Position pos, String var) {
        this.pos = pos;
        this.var = Function.valueOf(var);
    }

    public String toString() {
        return var.name();
    }

    @Override
    public void verifSemantique() throws Exception {

    }

    @Override
    public ArrayList<Instruction> genIntermediate() {
        return null;
    }
}
