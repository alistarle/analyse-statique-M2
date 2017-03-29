package analysis.method;

import analysis.utils.Data;
import analysis.utils.Info;
import analysis.utils.Pair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by alistarle on 28/03/2017.
 */
public abstract class Method<T> {

    public HashSet<T> f(HashSet<T> labelAnalysis, int label)
    {
        HashSet<T> result = new HashSet<>();
        result.addAll((Collection<T>) labelAnalysis.clone());
        result.removeAll(kill(label));
        result.addAll((Collection<T>) gen(label).clone());
        return result;
    }

    public abstract HashSet<T> kill(int l);
    public abstract HashSet<T> gen(int l);
    public abstract HashSet<T> U(HashSet<HashSet<T>> entries);
    public abstract boolean C(HashSet<T> left, HashSet<T> right);

    public abstract HashSet<Pair> F(Data d);
    public abstract HashSet<T> I(Data d);
    public abstract ArrayList<Integer> E(Data d);
    public abstract HashSet<T> T(Data d);

    public abstract HashSet<Info> interpret(HashMap<Integer, HashSet<T>> analysis);
}
