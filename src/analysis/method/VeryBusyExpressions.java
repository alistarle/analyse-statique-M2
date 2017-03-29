package analysis.method;

import analysis.utils.Data;
import analysis.utils.Info;
import analysis.utils.Pair;
import ast.Expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by alistarle on 28/03/2017.
 */
public class VeryBusyExpressions extends Method<Expression> {
    @Override
    public HashSet<Expression> kill(int l) {
        return null;
    }

    @Override
    public HashSet<Expression> gen(int l) {
        return null;
    }

    @Override
    public HashSet<Expression> U(HashSet<HashSet<Expression>> entries) {
        return null;
    }

    @Override
    public boolean C(HashSet<Expression> left, HashSet<Expression> right) {
        return false;
    }

    @Override
    public HashSet<Pair> F(Data d) {
        return null;
    }

    @Override
    public HashSet<Expression> I(Data d) {
        return null;
    }

    @Override
    public ArrayList<Integer> E(Data d) {
        return null;
    }

    @Override
    public HashSet<Expression> T(Data d) {
        return null;
    }

    @Override
    public HashSet<Info> interpret(HashMap<Integer, HashSet<Expression>> analysis) {
        return null;
    }
}
