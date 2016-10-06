package com.hadihariri.kotlincourse.functions

/**
 * Created by hadihariri on 25/08/16.
 */

fun nonOp(x: Int) {

}



inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    throw Exception("A Message")
    println("After calling op()")
}

fun tryingToInline( op: () -> Unit) {
    val reference = op
    println("Assigned value")
    op()
}


fun anotherFunction() {
    operation { println("This is the actual op function") }
}

fun main(args: Array<String>) {

    operation { println("This is the actual op function") }

}