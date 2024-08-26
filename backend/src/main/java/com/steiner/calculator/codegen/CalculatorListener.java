// Generated from Calculator.g4 by ANTLR 4.13.2

package com.steiner.calculator.codegen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PMWithAtom}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPMWithAtom(CalculatorParser.PMWithAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PMWithAtom}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPMWithAtom(CalculatorParser.PMWithAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PMWithSelf}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPMWithSelf(CalculatorParser.PMWithSelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PMWithSelf}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPMWithSelf(CalculatorParser.PMWithSelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PMWithMD}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPMWithMD(CalculatorParser.PMWithMDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PMWithMD}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPMWithMD(CalculatorParser.PMWithMDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MD}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterMD(CalculatorParser.MDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MD}
	 * labeled alternative in {@link CalculatorParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitMD(CalculatorParser.MDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MDWithAtom}
	 * labeled alternative in {@link CalculatorParser#multiOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterMDWithAtom(CalculatorParser.MDWithAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MDWithAtom}
	 * labeled alternative in {@link CalculatorParser#multiOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitMDWithAtom(CalculatorParser.MDWithAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MDWithSelf}
	 * labeled alternative in {@link CalculatorParser#multiOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterMDWithSelf(CalculatorParser.MDWithSelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MDWithSelf}
	 * labeled alternative in {@link CalculatorParser#multiOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitMDWithSelf(CalculatorParser.MDWithSelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomInt}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomInt(CalculatorParser.AtomIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomInt}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomInt(CalculatorParser.AtomIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomDouble}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomDouble(CalculatorParser.AtomDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomDouble}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomDouble(CalculatorParser.AtomDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalculatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalculatorParser.ParensContext ctx);
}