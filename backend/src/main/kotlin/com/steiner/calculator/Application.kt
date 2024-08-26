package com.steiner.calculator

import io.ktor.server.application.*
import com.steiner.calculator.plugin.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    configureErrorHandler()
    configureSerialization()
    configureHTTP()
    configureRouting()
}