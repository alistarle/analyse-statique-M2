package ast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alistarle on 07/03/2017.
 */
public abstract class Instruction extends Ast {
    public int label;
    public static int lbl_index = 0;

    public Instruction() {
        this.label = lbl_index++;
    }

    public abstract ArrayList<intermediate.Instruction> genIntermediate();

    public HashMap<Integer, Instruction> getLabels() {
        HashMap<Integer, Instruction> labels = new HashMap<>();
        labels.put(label, this);
        return labels;
    }

}
