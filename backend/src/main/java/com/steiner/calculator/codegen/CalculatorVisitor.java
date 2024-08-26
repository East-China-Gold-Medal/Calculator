// Generated from Calculator.g4 by ANTLR 4.13.2

package com.steiner.calculator.codegen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PMWithAtom}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPMWithAtom(CalculatorParser.PMWithAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PMWithSelf}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPMWithSelf(CalculatorParser.PMWithSelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PMWithMD}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPMWithMD(CalculatorParser.PMWithMDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MD}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMD(CalculatorParser.MDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MDWithAtom}
	 * labeled alternative in {@link CalculatorParser#multiOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMDWithAtom(CalculatorParser.MDWithAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MDWithSelf}
	 * labeled alternative in {@link CalculatorParser#multiOrDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMDWithSelf(CalculatorParser.MDWithSelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomInt}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInt(CalculatorParser.AtomIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomDouble}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomDouble(CalculatorParser.AtomDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CalculatorParser.ParensContext ctx);
}