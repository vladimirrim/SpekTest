package ru.hse.egorov.Spek2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.spekframework.spek2.Spek
import org.spekframework.spek2.lifecycle.CachingMode
import org.spekframework.spek2.style.specification.describe
import ru.hse.egorov.Calculator

object CalculatorSpec2: Spek({
    describe("A calculator") {
        val calculator by memoized { Calculator() }

        describe("addition") {
            it("returns the sum of its arguments") {
                assertEquals(3, calculator.sum(1, 2))
            }
        }
    }
})

object SetSpec2: Spek({
    describe("A set") {
        val set by memoized(CachingMode.EACH_GROUP) { mutableSetOf<String>() }

        describe("adding an item") {
            beforeEachTest {
                set.add("item")
            }

            it("should contain item") {
                assertEquals("item", set.first())
            }

            it("should have a size > 0") {
                assertTrue(set.size > 0)
            }
        }
    }

    describe("adding 1 + 2") {
        lateinit var result: String
        beforeEachTest {
            result = "1" + "2"
        }

        it("result should be 12") {
            assertEquals(result, "12")
        }
    }
})