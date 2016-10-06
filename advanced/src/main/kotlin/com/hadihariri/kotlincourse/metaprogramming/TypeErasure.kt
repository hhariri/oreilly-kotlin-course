package com.hadihariri.kotlincourse.metaprogramming

/**
 * Created by hadihariri on 26/08/16.
 */

fun <T> printList(list: List<T>) {
    if (list is List<*>) {
        println("This is a list")
    }
}

fun <T> printList(obj: T) {
    when (obj) {
        is Int -> println("This is an int")
        is String -> println("This is an string")
    }
}

inline fun <reified T> erased(input: List<Any>) {
    if (input is T) {

    }
}

inline fun <reified T> typeInfo() {
    println(T::class)
}

fun main(args: Array<String>) {

    val listStrings = listOf("One", "Two", "Three")
    val listNumbers = listOf(1, 2, 3)


}