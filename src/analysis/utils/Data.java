package analysis.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by alistarle on 28/03/2017.
 */
public class Data {
    public ArrayList<Integer> inits;
    public ArrayList<Integer> finals;

    public HashSet<Pair> flow;
    public HashSet<Pair> flowR;

    public ArrayList<Integer> labels;

    public Data(ArrayList<Integer> inits, ArrayList<Integer> finals, HashSet<Pair> flow, ArrayList<Integer> labels) {
        this.inits = inits;
        this.finals = finals;
        this.flow = flow;
        this.labels = labels;

        this.flowR = new HashSet<>(flow);
        Iterator<Pair> i = flowR.iterator();
        while(i.hasNext())
        {
            i.next().reverse();
        }
    }

    @Override
    public String toString() {
        return "Data{" +
                "inits=" + inits +
                ", finals=" + finals +
                ", flow=" + flow +
                ", flowR=" + flowR +
                ", labels=" + labels +
                '}';
    }
}
