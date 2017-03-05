// Generated from /Users/alistarle/Documents/Master/AS/src/While.g4 by ANTLR 4.5.1
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
	 * Visit a parse tree produced by {@link WhileParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(WhileParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#ldeclIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLdeclIdentifier(WhileParser.LdeclIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#ldeclVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLdeclVariables(WhileParser.LdeclVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#declVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVariables(WhileParser.DeclVariablesContext ctx);
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
	 * Visit a parse tree produced by {@link WhileParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(WhileParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(WhileParser.AexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#laexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaexpression(WhileParser.LaexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#aexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpression(WhileParser.AexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileParser#bexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpression(WhileParser.BexpressionContext ctx);
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