package com.hadihariri.kotlincourse.functions

/**
 * Created by hadihariri on 24/08/16.
 */

fun hello(): Unit {
    println("Hello")
}

fun throwingExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnsAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String = "", phone: String = "NA") {
    println("name: $name - email: $email - phone: $phone")
}

fun printStrings(vararg strings: String) {
    reallyPrintingStrings(*strings)
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {

    hello()

    val value = returnsAFour()

    takingString("Some value")

    sum(1, 2, 3)
    sum(1, 2)

    printDetails("Hadi",  phone = "555 123", email = "555 123")

    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")


}


