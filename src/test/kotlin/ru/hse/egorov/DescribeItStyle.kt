package ru.hse.egorov

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.jetbrains.spek.api.dsl.xit
import org.junit.jupiter.api.Assertions.assertEquals

object SimpleSpec: Spek({
    describe("a calculator") {
        val calculator = Calculator()

        on("addition") {
            val sum = calculator.sum(2, 4)

            it("should return the result of adding the first number to the second number") {
                assertEquals(6, sum)
            }
        }

        on("subtraction") {
            val subtract = calculator.subtract(4, 2)

            xit("should return the result of subtracting the second number from the first number") {
                assertEquals(2, subtract)
            }
        }
    }
})