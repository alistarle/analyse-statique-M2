package analysis.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

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

        this.flowR = new HashSet<>();
        flowR.addAll(flow.stream().map(p -> new Pair(p.to, p.from)).collect(Collectors.toList()));
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
