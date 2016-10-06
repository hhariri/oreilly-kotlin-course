package com.hadihariri.kotlincourse.basics

/**
 * Created by hadihariri on 24/08/16.
 */


fun main(args: Array<String>) {

    val result = "Value"
    val whenValue = when (result) {
        "Value" -> {
            println("It's a value")
            println("Second statement")
            "Returning from first when case"
        }
        is String -> {
            println("Excellent")
            "Remove that"
        }
        else -> {
            println("It came to this?")
            "This warning is now gone"
        }
    }
    println(whenValue)
}