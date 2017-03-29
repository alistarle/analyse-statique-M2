package analysis.method;

import analysis.utils.Couple;
import analysis.utils.Data;
import analysis.utils.Info;
import analysis.utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by alistarle on 28/03/2017.
 */
public class ReachableDefinitions extends Method<Couple> {

    @Override
    public HashSet<Couple> kill(int l) {
        return null;
    }

    @Override
    public HashSet<Couple> gen(int l) {
        return null;
    }

    @Override
    public HashSet<Couple> U(HashSet<HashSet<Couple>> entries) {
        return null;
    }

    @Override
    public boolean C(HashSet<Couple> left, HashSet<Couple> right) {
        return false;
    }

    @Override
    public HashSet<Pair> F(Data d) {
        return null;
    }

    @Override
    public HashSet<Couple> I(Data d) {
        return null;
    }

    @Override
    public ArrayList<Integer> E(Data d) {
        return null;
    }

    @Override
    public HashSet<Couple> T(Data d) {
        return null;
    }

    @Override
    public HashSet<Info> interpret(HashMap<Integer, HashSet<Couple>> analysis) {
        return null;
    }
}
