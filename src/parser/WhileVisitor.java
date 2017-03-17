// Generated from /Users/alistarle/Documents/Master/AS/src/While.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WhileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WhileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link WhileParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WhileParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(WhileParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#ldeclIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLdeclIdentifier(WhileParser.LdeclIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link WhileParser#declVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(WhileParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#lidentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLidentifier(WhileParser.LidentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ControleIf}
	 * labeled alternative in {@link WhileParser#controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControleIf(WhileParser.ControleIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ControleWhile}
	 * labeled alternative in {@link WhileParser#controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControleWhile(WhileParser.ControleWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(WhileParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link WhileParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(WhileParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignTabExp}
	 * labeled alternative in {@link WhileParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignTabExp(WhileParser.AssignTabExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(WhileParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicNot}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicNot(WhileParser.LogicNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(WhileParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(WhileParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(WhileParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(WhileParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdArray}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdArray(WhileParser.IdArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(WhileParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(WhileParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpSub}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpSub(WhileParser.ExpSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(WhileParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link WhileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(WhileParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(WhileParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(WhileParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WhileParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(WhileParser.TypeContext ctx);
}