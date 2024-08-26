package com.steiner.calculator.plugin

import com.steiner.calculator.exception.ParseException
import com.steiner.calculator.util.Response
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

fun Application.configureErrorHandler() {
    val logger = log
    install(StatusPages) {
        exception<BadRequestException> { call, cause ->
            logger.error(cause.stackTraceToString())
            call.respond(HttpStatusCode.BadRequest, Response.Err("bad request! ${cause.message}"))
        }

        exception<ParseException> { call, cause ->
            logger.error(cause.stackTraceToString())
            call.respond(HttpStatusCode.BadRequest, Response.Err(cause.message))
        }
    }
}