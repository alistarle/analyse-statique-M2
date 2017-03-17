package main;

import ast.*;
import exceptions.CompilationException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.WhileBaseVisitor;
import parser.WhileLexer;
import parser.WhileParser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by thomas on 24/02/16.
 */
public class BuildAST extends WhileBaseVisitor<Ast> {

    public static Position position(ParserRuleContext ctx){
        Position pos = new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        return pos;
    }

    @Override
    public Ast visitProgram(final WhileParser.ProgramContext ctx) {
        List<Declaration> d = new ArrayList<>();
        List<Instruction> ins = parseStatements(ctx.statements());
        List<Function> f = ctx.function().stream().map(child -> (Function) visit(child)).collect(Collectors.toList());

        for(WhileParser.DeclVariablesContext declCtx : ctx.declVariables()) {
            final WhileParser.DeclareContext dc = (WhileParser.DeclareContext) declCtx;
            d.addAll(dc.lidentifier().Identifier().stream().map(s -> new DeclareVar(position(ctx), ((Type) visitType(dc.type())).getType(), s.toString())).collect(Collectors.toList()));
        }

        return new Program(position(ctx),d,f,ins);
    }

    @Override
    public Ast visitFunction(WhileParser.FunctionContext ctx) {
        List<Instruction> ins = parseStatements(ctx.statements());
        ArrayList<Declaration> param = new ArrayList<>();

        for(int i = 0; i < ctx.ldeclIdentifier().Identifier().size(); i++) {
            Type type = (Type) this.visitType(ctx.ldeclIdentifier().type(i));
            param.add(new DeclareVar(null,type.getType(),ctx.ldeclIdentifier().Identifier(i).toString()));
        }

        Type type = (Type) this.visitType(ctx.type());
        Declaration ret = new DeclareVar(position(ctx), type.getType(), ctx.Identifier(1).toString());
        param.add(ret);

        return new Function(position(ctx), ret, ins,param,ctx.Identifier(0).toString(), type.getType());
    }

    @Override
    public Ast visitFunctionCall(WhileParser.FunctionCallContext ctx) {
        ArrayList<Expression> param = new ArrayList<>();
        for(ParseTree child : ctx.expression()){
            Ast i = visit(child);
            if(i != null && i instanceof Expression){
                param.add((Expression) i);
            }
        }
        return new FunctionCall(position(ctx),ctx.Identifier().toString(),param);
    }

    @Override
    public Ast visitAssignVar(WhileParser.AssignVarContext ctx) {
        Expression expression = (Expression) visit(ctx.expression());
        return new AssignVar(position(ctx), ctx.Identifier().toString(), expression);
    }

    @Override
    public Ast visitStatement(WhileParser.StatementContext ctx) {
        if(ctx.getChild(0) == null)
            ErrorHandling.handleError(new CompilationException(position(ctx),"Erreur dans l'instruction"));
        return visit(ctx.getChild(0));
    }

    public ArrayList<Instruction> parseBlock(WhileParser.BlockContext ctx) {
        ArrayList<Instruction> ins = new ArrayList<>();
        if(ctx.statement() != null)
            ins.add((Instruction) visit(ctx.statement()));
        else
            ins.addAll(parseStatements(ctx.statements()));
        return ins;
    }

    public ArrayList<Instruction> parseStatements(WhileParser.StatementsContext ctx) {
        return ctx.statement().stream().map(child -> (Instruction) visit(child)).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public Ast visitControleWhile(WhileParser.ControleWhileContext ctx) {
        Expression e = (Expression) visit(ctx.expression());
        List<Instruction> ins =  parseBlock(ctx.block());
        return new ControlWhile(position(ctx), e, ins);
    }

    @Override
    public Ast visitControleIf(WhileParser.ControleIfContext ctx) {
        Expression e = (Expression) visit(ctx.expression());
        List<Instruction> lif = parseBlock(ctx.block(0));
        List<Instruction> lelse = (ctx.block(1) != null) ? parseBlock(ctx.block(1)) : new ArrayList<>();
        return new ControlIf(position(ctx), e, lif, lelse );
    }

    @Override
    public Ast visitEqual(WhileParser.EqualContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        switch (ctx.op.getType()) {
            case WhileLexer.EQ:
                return new ExpBinop(position(ctx), e0, Binop.EQ, e1);
            case WhileLexer.NEQ:
                return new ExpBinop(position(ctx), e0, Binop.NEQ, e1);
        }
        return null;
    }

    @Override
    public Ast visitLogicNot(WhileParser.LogicNotContext ctx) {
        Expression e = (Expression) visit(ctx.expression());
        return new ExpUnop(position(ctx), e, Unop.NOT);
    }

    @Override
    public Ast visitExpSub(WhileParser.ExpSubContext ctx) {
        Expression e = (Expression) visit(ctx.expression());
        return new ExpUnop(position(ctx), e, Unop.SUB);
    }

    @Override
    public Ast visitAddSub(WhileParser.AddSubContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        if ( ctx.op.getType() == WhileLexer.ADD)
            return new ExpBinop(position(ctx),e0,Binop.ADD,e1);
        else
            return new ExpBinop(position(ctx),e0,Binop.SUB,e1);
    }

    @Override
    public Ast visitMulDiv(WhileParser.MulDivContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        if ( ctx.op.getType() == WhileLexer.MUL)
            return new ExpBinop(position(ctx),e0,Binop.MUL,e1);
        else
            return new ExpBinop(position(ctx),e0,Binop.DIV,e1);
    }

    @Override
    public Ast visitLogic(WhileParser.LogicContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        switch (ctx.op.getType()){
            case WhileLexer.AND:
                return new ExpBinop(position(ctx),e0,Binop.AND,e1);
            case WhileLexer.OR:
                return new ExpBinop(position(ctx),e0,Binop.OR,e1);
        }
        return null;
    }

    @Override
    public Ast visitComp(WhileParser.CompContext ctx) {
        Expression e0 = (Expression) visit(ctx.expression(0));
        Expression e1 = (Expression) visit(ctx.expression(1));
        switch (ctx.op.getType()){
            case WhileLexer.GT:
                return new ExpBinop(position(ctx),e0,Binop.GT,e1);
            case WhileLexer.GTE:
                return new ExpBinop(position(ctx),e0,Binop.GTE,e1);
            case WhileLexer.LT:
                return new ExpBinop(position(ctx),e0,Binop.LT,e1);
            case WhileLexer.LTE:
                return new ExpBinop(position(ctx),e0,Binop.LTE,e1);
        }
        return null;
    }

    @Override
    public Ast visitPar(WhileParser.ParContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Ast visitInt(WhileParser.IntContext ctx) {
        Integer integer = Integer.parseInt(ctx.Constante().toString());
        if(ctx.SUB() != null) integer = -integer;
        return new ExpInt(position(ctx), integer);
    }

    @Override
    public Ast visitBoolean(WhileParser.BooleanContext ctx) {
        return new ExpBool(position(ctx), Bool.valueOf(ctx.BOOLEAN().toString().toUpperCase()));
    }

    @Override
    public Ast visitId(WhileParser.IdContext ctx) {
        return new ExpVar(position(ctx), ctx.Identifier().toString());
    }


    @Override
    public Ast visitIdArray(WhileParser.IdArrayContext ctx) {
        return new ExpIdArray(position(ctx), ctx.Identifier().toString(), (Expression) visit(ctx.expression()));
    }

    public Ast visitType(WhileParser.TypeContext ctx) {
        if(ctx.Int() != null)
            return new Type(position(ctx), Type.EnumType.INTVAL);
        else if(ctx.Boolean() != null)
            return new Type(position(ctx), Type.EnumType.BOOLVAL);
        return null;
    }

}
