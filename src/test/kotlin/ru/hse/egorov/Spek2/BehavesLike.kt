package ru.hse.egorov.Spek2

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.Suite
import org.spekframework.spek2.style.specification.describe
import ru.hse.egorov.AdvancedCalculator
import ru.hse.egorov.Calculator

object CalculatorSpecs: Spek({
    fun Suite.behavesLikeACalculator() {
        val calculator by memoized<Calculator>()

        it("1 + 2 = 3") {
            assertEquals(3, calculator.sum(1, 2))
        }
    }

    describe("Calculator") {
        val calculator by memoized { Calculator() }

        behavesLikeACalculator()
    }

    describe("AdvancedCalculator") {
        val calculator by memoized { AdvancedCalculator() }

        behavesLikeACalculator()

        it("2 ^ 3 = 8") {
            assertEquals(8.0, calculator.pow(2.0, 3.0))
        }
    }
})