package com.hadihariri.kotlincourse.functions

/**
 * Created by hadihariri on 25/08/16.
 */


inline fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction() {
    val numbers = 1..100

    numbers.forEach ( fun(element) {
        if (element % 5 == 0) {
            return
        }
    })
    println("Hello!")
}

fun main(args: Array<String>) {
    containingFunction()
}