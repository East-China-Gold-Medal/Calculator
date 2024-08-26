package com.steiner.calculator.parser

import kotlinx.serialization.Serializable

sealed class DoubleOrInt {
    @Serializable
    class DoubleValue(val data: Double): DoubleOrInt() {
        override fun plus(other: DoubleOrInt): DoubleOrInt {
            return when (other) {
                is DoubleValue -> DoubleValue(data + other.data)
                is IntValue -> DoubleValue(data + other.data)
                else -> other
            }
        }

        override fun minus(other: DoubleOrInt): DoubleOrInt {
            return when (other) {
                is DoubleValue -> DoubleValue(data - other.data)
                is IntValue -> DoubleValue(data - other.data)
                else -> other
            }
        }

        override fun times(other: DoubleOrInt): DoubleOrInt {
            return when (other) {
                is DoubleValue -> DoubleValue(data * other.data)
                is IntValue -> DoubleValue(data * other.data)
                else -> other
            }
        }

        override fun div(other: DoubleOrInt): DoubleOrInt {
            return when (other) {
                is DoubleValue -> if (other.data == 0.0) {
                    Error("div by 0")
                } else {
                    DoubleValue(data / other.data)
                }

                is IntValue -> if (other.data == 0) {
                    Error("div by 0")
                } else {
                  DoubleValue(data / other.data)
                }

                else -> other
            }
        }

        override fun unaryMinus(): DoubleOrInt {
            return DoubleValue(-data)
        }

        override fun toString(): String {
            return data.toString()
        }
    }

    @Serializable
    class IntValue(val data: Int): DoubleOrInt() {
        override fun plus(other: DoubleOrInt): DoubleOrInt {
            return when (other) {
                is DoubleValue -> DoubleValue(data + other.data)
                is IntValue -> IntValue(data + other.data)
                else -> other
            }
        }

        override fun minus(other: DoubleOrInt): DoubleOrInt {
            return when (other) {
                is DoubleValue -> DoubleValue(data - other.data)
                is IntValue -> IntValue(data - other.data)
                else -> other
            }
        }

        override fun times(other: DoubleOrInt): DoubleOrInt {
            return when (other) {
                is DoubleValue -> DoubleValue(data * other.data)
                is IntValue -> IntValue(data * other.data)
                else -> other
            }
        }

        override fun div(other: DoubleOrInt): DoubleOrInt {
            return when (other) {
                is DoubleValue -> if (other.data == 0.0) {
                    Error("div by 0")
                } else {
                    DoubleValue(data / other.data)
                }

                is IntValue -> if (other.data == 0) {
                    Error("div by 0")
                } else {
                    IntValue(data / other.data)
                }

                else -> other
            }
        }

        override fun unaryMinus(): DoubleOrInt {
            return IntValue(-data)
        }

        override fun toString(): String {
            return data.toString()
        }

    }

    @Serializable
    class Error(val error: String): DoubleOrInt() {
        override fun plus(other: DoubleOrInt): DoubleOrInt {
            return this
        }

        override fun minus(other: DoubleOrInt): DoubleOrInt {
            return this
        }

        override fun times(other: DoubleOrInt): DoubleOrInt {
            return this
        }

        override fun div(other: DoubleOrInt): DoubleOrInt {
            return this
        }

        override fun unaryMinus(): DoubleOrInt {
            return this
        }

        override fun toString(): String {
            return "Error: $error"
        }
    }

    abstract operator fun plus(other: DoubleOrInt): DoubleOrInt
    abstract operator fun minus(other: DoubleOrInt): DoubleOrInt
    abstract operator fun times(other: DoubleOrInt): DoubleOrInt
    abstract operator fun div(other: DoubleOrInt): DoubleOrInt
    abstract operator fun unaryMinus(): DoubleOrInt
}