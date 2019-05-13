package ru.hse.egorov.Spek2

import org.spekframework.spek2.Spek

object MyTest: Spek({
    beforeGroup {
        println("before root")
    }

    group("some group") {
        beforeEachTest {
            println("before each test")
        }

        afterEachTest {
            println("after each test")
        }

        test("some test") {
            println("some test")
        }

        test("another test") {
            println("another test")
        }
    }

    afterGroup {
        println("after root")
    }
})