package analysis.utils;

import ast.Declaration;

/**
 * Created by alistarle on 29/03/2017.
 */
public class Couple {

    private Declaration var;
    private int label;

    public Couple(Declaration var, int label) {
        this.var = var;
        this.label = label;
    }

    public Declaration getVar() {
        return var;
    }

    public int getLabel() {
        return label;
    }
}
