package com.steiner.calculator.plugin

import com.steiner.calculator.codegen.CalculatorLexer
import com.steiner.calculator.codegen.CalculatorParser
import com.steiner.calculator.exception.ParseException
import com.steiner.calculator.parser.CalculatorVisitor
import com.steiner.calculator.request.CalculateRequest
import com.steiner.calculator.util.Response
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun Application.configureRouting() {
    routing {
        post("/") {
            val request = call.receive<CalculateRequest>()
            val chars = CharStreams.fromString(request.text)
            val lexer = CalculatorLexer(chars)
            val token = CommonTokenStream(lexer)
            val parser = CalculatorParser(token)
            val tree = parser.expr()

            val visitor = CalculatorVisitor()

            try {
                val result = visitor.visit(tree)
                call.respond(Response.Ok("calculate ok", result.toString()))
            } catch (exception: NullPointerException) {
                throw ParseException("parse error")
            }
        }

        get("/hello") {
            call.respond(
                Response.Ok("hello", "world")
            )
        }
    }
}