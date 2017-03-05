// Generated from /Users/alistarle/Documents/Master/AS/src/While.g4 by ANTLR 4.5.1
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
	 * Enter a parse tree produced by {@link WhileParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(WhileParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(WhileParser.DeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link WhileParser#ldeclVariables}.
	 * @param ctx the parse tree
	 */
	void enterLdeclVariables(WhileParser.LdeclVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#ldeclVariables}.
	 * @param ctx the parse tree
	 */
	void exitLdeclVariables(WhileParser.LdeclVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#declVariables}.
	 * @param ctx the parse tree
	 */
	void enterDeclVariables(WhileParser.DeclVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#declVariables}.
	 * @param ctx the parse tree
	 */
	void exitDeclVariables(WhileParser.DeclVariablesContext ctx);
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
	 * Enter a parse tree produced by {@link WhileParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(WhileParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(WhileParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(WhileParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(WhileParser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#laexpression}.
	 * @param ctx the parse tree
	 */
	void enterLaexpression(WhileParser.LaexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#laexpression}.
	 * @param ctx the parse tree
	 */
	void exitLaexpression(WhileParser.LaexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void enterAexpression(WhileParser.AexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#aexpression}.
	 * @param ctx the parse tree
	 */
	void exitAexpression(WhileParser.AexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void enterBexpression(WhileParser.BexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileParser#bexpression}.
	 * @param ctx the parse tree
	 */
	void exitBexpression(WhileParser.BexpressionContext ctx);
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