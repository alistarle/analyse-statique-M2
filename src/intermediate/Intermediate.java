package intermediate;

import ast.Declaration;
import ast.ExpVar;
import ast.Program;
import intermediate.instruction.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by alistarle on 22/04/2016.
 */
public class Intermediate {

    public static ArrayList<Frame> frameList = new ArrayList<>();

    public static int reg_index = -1;
    public static int lbl_index = 0;

    //Use to process return calculation
    public static Label return_label;
    public static int return_reg = fresh_reg();

    public static void genIntermediate(Program program)
    {
        ExpVar.FLAG_REG = true; //Flag the ExpVar class to use the regIndex representaiton and no longer name representation in toString

        //On ajoute les fonctions du programme
        frameList.addAll(program.functions.stream().map(func -> genFrame(func.params, func.ins)).collect(Collectors.toList()));

        //On ajoute la fonction principale
        frameList.add(genFrame(program.params, program.ins));
    }

    public static Frame genFrame(List<Declaration> paramList, List<ast.Instruction> ins) {
        Label entry_label = new Label(fresh_lbl());
        return_label = new Label(fresh_lbl());
        return_reg = fresh_reg();

        ArrayList<Integer> params = new ArrayList<>();
        for(Declaration param : paramList)
            params.add(param.getIndex());

        Frame frame = new Frame(entry_label,return_label,params,return_reg);

        ArrayList<Instruction> instructions = new ArrayList<>();
        instructions.add(entry_label);
        for(ast.Instruction instruction : ins)
            instructions.addAll(instruction.genIntermediate());
        instructions.add(return_label);
        frame.setInstructions(instructions);
        return frame;
    }

    public static String printIntermediate()
    {
        StringBuilder sb = new StringBuilder();
        for(Frame frame : frameList)
        {
            sb.append(frame.toString());
        }

        return sb.toString();
    }

    public static int fresh_reg()
    {
        return reg_index++;
    }

    public static int fresh_lbl()
    {
        return lbl_index++;
    }

}
