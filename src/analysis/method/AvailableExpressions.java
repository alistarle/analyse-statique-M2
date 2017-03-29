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
public class AvailableExpressions extends Method<Expression> {

    @Override
    public HashSet<Expression> kill(int l) {
        /*Instruction ins = Analyzer.controlFlowGraph.get(l);
        if(ins instanceof Declaration) {

        } else if(ins instanceof Control) {

        } else {
            return
        }*/
        return null;
    }

    @Override
    public HashSet<Expression> gen(int l) {
        return null;
    }

    @Override
    public HashSet<Expression> U(HashSet<HashSet<Expression>> entries) {
        HashSet<Expression> exits = entries.iterator().next();
        while(entries.iterator().hasNext())
            exits.retainAll(entries.iterator().next());
        return exits;
    }

    @Override
    public boolean C(HashSet<Expression> left, HashSet<Expression> right) {
        return right.containsAll(left);
    }

    @Override
    public HashSet<Pair> F(Data d) {
        return d.flow;
    }

    @Override
    public HashSet<Expression> I(Data d) {
        return new HashSet<>();
    }

    @Override
    public ArrayList<Integer> E(Data d) {
        return d.inits;
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
