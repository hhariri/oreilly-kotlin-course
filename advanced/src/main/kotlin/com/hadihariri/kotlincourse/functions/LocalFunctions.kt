package com.hadihariri.kotlincourse.functions

/**
 * Created by hadihariri on 25/08/16.
 */

fun foo(fooParam: String) {

    val outerFunction = "Value"
    fun bar(barParam: String) {

        println(barParam)
        println(fooParam)
        println(outerFunction)
    }


}

fun main(args: Array<String>) {

    foo("Some value")


}

