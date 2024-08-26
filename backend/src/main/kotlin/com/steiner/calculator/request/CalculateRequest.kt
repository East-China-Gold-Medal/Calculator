package com.steiner.calculator.request

import kotlinx.serialization.Serializable

@Serializable
class CalculateRequest(
    val text: String
)