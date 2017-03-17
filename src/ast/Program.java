package ast;

import main.StringOffseter;

import java.util.List;

/**
 * Created by alistarle on 05/03/2017.
 */
public class Program extends Ast{

    public String id;
    public List<Function> functions;
    public List<Declaration> params;
    public List<Instruction> ins;

    public Program(Position pos, List<Declaration> params, List<Function> functions, List<Instruction> ins){
        this.pos = pos;
        this.params = params;
        this.functions = functions;
        this.ins = ins;
    }

    public String toString() {
        StringOffseter s = new StringOffseter();

        for(Function f:functions){
            s.append(f.toString()+"\n");
        }

        for(Declaration d: params){
            s.append(d.toString()+" ");
        }
        s.append("\n");
        for(Instruction i: ins) {
            s.append(i.toString()+"\n");
        }

        return s.toString();
    }

    @Override
    public void verifSemantique() throws Exception {
        for(Function f:functions){
            f.verifSemantique();
        }

        for(Declaration d: params){
            d.verifSemantique();
        }

        for(Instruction i: ins) {
            i.verifSemantique();
        }
    }
}
