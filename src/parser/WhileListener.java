// Generated from /Users/alistarle/Documents/Master/AS/src/While.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WhileParser}.
 */
public interface WhileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link WhileParser#main}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WhileParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link WhileParser#main}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WhileParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(WhileParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(WhileParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#ldeclIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterLdeclIdentifier(WhileParser.LdeclIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#ldeclIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitLdeclIdentifier(WhileParser.LdeclIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link WhileParser#declVariables}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(WhileParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link WhileParser#declVariables}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(WhileParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#lidentifier}.
	 * @param ctx the parse tree
	 */
	void enterLidentifier(WhileParser.LidentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#lidentifier}.
	 * @param ctx the parse tree
	 */
	void exitLidentifier(WhileParser.LidentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ControleIf}
	 * labeled alternative in {@link WhileParser#controle}.
	 * @param ctx the parse tree
	 */
	void enterControleIf(WhileParser.ControleIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ControleIf}
	 * labeled alternative in {@link WhileParser#controle}.
	 * @param ctx the parse tree
	 */
	void exitControleIf(WhileParser.ControleIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ControleWhile}
	 * labeled alternative in {@link WhileParser#controle}.
	 * @param ctx the parse tree
	 */
	void enterControleWhile(WhileParser.ControleWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ControleWhile}
	 * labeled alternative in {@link WhileParser#controle}.
	 * @param ctx the parse tree
	 */
	void exitControleWhile(WhileParser.ControleWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(WhileParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(WhileParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link WhileParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(WhileParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link WhileParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(WhileParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignTabExp}
	 * labeled alternative in {@link WhileParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignTabExp(WhileParser.AssignTabExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignTabExp}
	 * labeled alternative in {@link WhileParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignTabExp(WhileParser.AssignTabExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPar(WhileParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPar(WhileParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicNot}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicNot(WhileParser.LogicNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicNot}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicNot(WhileParser.LogicNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(WhileParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(WhileParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(WhileParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(WhileParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual(WhileParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual(WhileParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(WhileParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(WhileParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdArray}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdArray(WhileParser.IdArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdArray}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdArray(WhileParser.IdArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(WhileParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(WhileParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic(WhileParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic(WhileParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpSub}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpSub(WhileParser.ExpSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpSub}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpSub(WhileParser.ExpSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(WhileParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(WhileParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComp(WhileParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComp(WhileParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(WhileParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(WhileParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(WhileParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(WhileParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WhileParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WhileParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WhileParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WhileParser.TypeContext ctx);
}