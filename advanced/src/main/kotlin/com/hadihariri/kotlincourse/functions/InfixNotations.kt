package com.hadihariri.kotlincourse.functions

/**
 * Created by hadihariri on 25/08/16.
 */


infix fun String.shouldBeEqualTo(value: String) = this == value


fun main(args: Array<String>) {


    val output = "Hello"

    output shouldBeEqualTo "Hello"

}