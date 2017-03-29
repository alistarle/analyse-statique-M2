package analysis;

import analysis.method.*;
import analysis.utils.Data;
import analysis.utils.Info;
import analysis.utils.Pair;
import ast.Declaration;
import ast.Expression;
import ast.Instruction;
import ast.Program;

import java.util.*;

/**
 * Created by alistarle on 28/03/2017.
 */
public class Analyzer{

    private Program program;
    private Data data;

    public static List<Expression> aExp;
    public static List<Declaration> var;

    public static  HashMap<Integer, Instruction> controlFlowGraph = new HashMap<>();
    private static ArrayList<Method> methods = new ArrayList<Method>() {{
        //add(new AvailableExpressions());
        add(new LivingVariables());
        //add(new ReachableDefinitions());
        //add(new VeryBusyExpressions());
    }};

    public Analyzer(Program program)
    {
        this.program = program;
        this.var = program.params;
        this.data = genData(program);
        System.out.println(this.data);
    }

    public Data genData(Program program) {
        ArrayList<Integer> inits = new ArrayList<Integer>(){{ add(program.ins.get(0).label); }};
        ArrayList<Integer> finals = new ArrayList<Integer>(){{ add(program.ins.get(program.ins.size()-1).label); }};

        HashSet<Pair> flow = program.getFlow();

        ArrayList<Integer> labels = new ArrayList<>();
        for(Instruction ins : program.ins)
        {
            controlFlowGraph.putAll(ins.getLabels());
        }
        labels.addAll(controlFlowGraph.keySet());

        return new Data(inits, finals, flow, labels);
    }

    public ArrayList<Info> analyse()
    {
        ArrayList<Info> infos = new ArrayList<>();

        for(Method m : methods)
        {
            infos.addAll(m.interpret(mfp(m,data)));
        }

        return infos;
    }

    private HashMap<Integer, HashSet<Object>> mfp(Method m, Data d)
    {
        /**
         * Initialisation
         */
        Stack<Pair> w = new Stack<>();
        HashSet<Pair> flow = m.F(d);
        flow.forEach(w::push);

        HashMap<Integer, HashSet<Object>> analysis = new HashMap<>();

        for(int i : d.labels)
        {
            if(d.inits.contains(i))
                analysis.put(i,m.I(d));
            else
                analysis.put(i,m.T(d));
        }

        System.out.println(analysis);

        /**
         * Iteration
         */
        while (w.size() > 0){
            Pair p = w.pop();
            System.out.println("Process "+p+"\n");
            if(!m.C(  m.f(analysis.get(p.from), p.from)  ,   analysis.get(p.to)  ))
            {
                analysis.get(p.to).addAll(m.f(analysis.get(p.from), p.from));
                for(Pair p2 : flow)
                    if(p.to == p2.from)
                        w.push(p2);
            }
            System.out.println(analysis);
            System.out.println();
        }

        /**
         * Result
         */

        return analysis;
    }

    public Program getProgram() {
        return program;
    }

    public HashMap<Integer, Instruction> getControlFlowGraph() {
        return controlFlowGraph;
    }

    public Data getData() {
        return data;
    }
}
