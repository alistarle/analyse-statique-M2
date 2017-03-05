package main;

import ast.Ast;
import ast.Program;
import intermediate.Intermediate;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.WhileLexer;
import parser.WhileParser;
import parser.WhileVisitor;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by thomas on 29/02/16.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        if(args.length == 0) {
            System.out.println("Vous devez spécifier en argument un chemin absolu vers un fichier .while");
            System.exit(0);
        }

        //Enable debug in Error Handling
        ErrorHandling.DEBUG = false;

        // FIRST STEP: analysis
        // Creation of the stream of characters
        File file = new File(args[0]);
        FileInputStream fis = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(fis);
        // Creation of the lexer for pico programs
        WhileLexer lexer = new WhileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Creation of the parser for pico programs
        WhileParser parser = new WhileParser(tokens);
        // Parse the input: the result is a parse tree
        ParseTree tree = parser.main();
        // Walk the parse tree in order to create an
        // abstract syntax tree

        WhileVisitor<Ast> buildAST = new BuildAST();
        Program program = (Program) buildAST.visit(tree);
        program.verifSemantique();

        //TODO Analyse statique

        System.out.println("=========== Affichage du pretty printer ===========");
        System.out.println(program.toString());

        System.out.println("=========== Language Intermediaire ===========");
        Intermediate.genIntermediate(program);
        System.out.println(Intermediate.printIntermediate());
    }
}
