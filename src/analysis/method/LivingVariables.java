package analysis.method;

import analysis.Analyzer;
import analysis.utils.Data;
import analysis.utils.Info;
import analysis.utils.Pair;
import ast.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by alistarle on 28/03/2017.
 */
public class LivingVariables extends Method<Declaration> {

    @Override
    public HashSet<Declaration> kill(int l) {
        Instruction ins = Analyzer.controlFlowGraph.get(l);
        HashSet<Declaration> list = new HashSet<>();
        if(ins instanceof Declaration) {
            list.add((Declaration) ins);
        } else if (ins instanceof AssignVar) {
            list.add(new DeclareVar(ins.pos, Type.EnumType.INTVAL, ((AssignVar) ins).var));
        }

        System.out.println("Kill("+l+"):"+list);
        return list;
    }

    @Override
    public HashSet<Declaration> gen(int l) {
        Instruction ins = Analyzer.controlFlowGraph.get(l);
        HashSet<Declaration> list = new HashSet<>();
        if(ins instanceof Declaration) {
            list.add((Declaration) ins);
        } else if(ins instanceof AssignVar) {
            list.addAll(((AssignVar) ins).exp.getVar());
        } else if(ins instanceof Control) {
            list.addAll(((Control) ins).exp.getVar());
        }
        System.out.println("Gen("+l+"):"+list);

        return list;
    }

    @Override
    public HashSet<Declaration> U(HashSet<HashSet<Declaration>> entries) {
        Iterator<HashSet<Declaration>> i = entries.iterator();
        HashSet<Declaration> exits = i.next();
        while(i.hasNext())
            exits.addAll(i.next());
        return exits;
    }

    @Override
    public boolean C(HashSet<Declaration> left, HashSet<Declaration> right) {
        for(Declaration d : right)
            if(!left.contains(d))
                return true;
        return false;
    }

    @Override
    public HashSet<Pair> F(Data d) {
        return d.flowR;
    }

    @Override
    public HashSet<Declaration> I(Data d) {
        return new HashSet<>();
    }

    @Override
    public ArrayList<Integer> E(Data d) {
        return d.finals;
    }

    @Override
    public HashSet<Declaration> T(Data d) {
        return new HashSet<>();
    }

    @Override
    public HashSet<Info> interpret(HashMap<Integer, HashSet<Declaration>> analysis) {
        System.out.println(analysis);

        HashMap<Integer, HashSet<Declaration>> exit = new HashMap<>();
        for(Integer i : analysis.keySet())
        {
            exit.put(i, this.f(analysis.get(i), i));
        }

        System.out.println(exit);
        return new HashSet<>();
    }
}
