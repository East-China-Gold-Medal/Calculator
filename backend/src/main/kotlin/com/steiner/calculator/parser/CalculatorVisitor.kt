package com.steiner.calculator.parser

import com.steiner.calculator.codegen.CalculatorBaseVisitor
import com.steiner.calculator.codegen.CalculatorParser

class CalculatorVisitor: CalculatorBaseVisitor<DoubleOrInt>() {
    override fun visitAtomInt(ctx: CalculatorParser.AtomIntContext): DoubleOrInt {
        return if (ctx.MINUS() != null) {
            DoubleOrInt.IntValue(-ctx.INT().text.toInt())
        } else {
            DoubleOrInt.IntValue(ctx.INT().text.toInt())
        }
    }

    override fun visitAtomDouble(ctx: CalculatorParser.AtomDoubleContext): DoubleOrInt {
        return if (ctx.MINUS() != null) {
            DoubleOrInt.DoubleValue(-ctx.DOUBLE().text.toDouble())
        } else {
            DoubleOrInt.DoubleValue(ctx.DOUBLE().text.toDouble())
        }
    }

    override fun visitParens(ctx: CalculatorParser.ParensContext): DoubleOrInt {
        return visit(ctx.plusOrMinus())
    }

    override fun visitExpr(ctx: CalculatorParser.ExprContext): DoubleOrInt {
        return visit(ctx.plusOrMinus())
    }

    override fun visitMDWithAtom(ctx: CalculatorParser.MDWithAtomContext): DoubleOrInt {
        val firstAtom = ctx.atom(0)
        val secondAtom = ctx.atom(1)

        return if (ctx.MULTI() != null) {
            visit(firstAtom) * visit(secondAtom)
        } else {
            visit(firstAtom) / visit(secondAtom)
        }
    }

    override fun visitMDWithSelf(ctx: CalculatorParser.MDWithSelfContext): DoubleOrInt {
        val first = ctx.atom()
        val second = ctx.plusOrMinus()

        return if (ctx.MULTI() != null) {
            visit(first) * visit(second)
        } else {
            visit(first) / visit(second)
        }
    }

    override fun visitPMWithAtom(ctx: CalculatorParser.PMWithAtomContext): DoubleOrInt {
        val first = ctx.atom(0)
        val second = ctx.atom(1)

        return if (ctx.PLUS() != null) {
            visit(first) + visit(second)
        } else {
            visit(first) - visit(second)
        }
    }

    override fun visitPMWithSelf(ctx: CalculatorParser.PMWithSelfContext): DoubleOrInt {
        val first = ctx.atom()
        val second = ctx.plusOrMinus()

        return if (ctx.PLUS() != null) {
            visit(first) + visit(second)
        } else {
            visit(first) - visit(second)
        }
    }

    override fun visitPMWithMD(ctx: CalculatorParser.PMWithMDContext): DoubleOrInt {
        val first = ctx.atom()
        val second = ctx.multiOrDiv()

        return if (ctx.PLUS() != null) {
            visit(first) + visit(second)
        } else {
            visit(first) - visit(second)
        }
    }
}