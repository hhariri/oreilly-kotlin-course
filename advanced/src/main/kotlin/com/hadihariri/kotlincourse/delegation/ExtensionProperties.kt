package com.hadihariri.kotlincourse.delegation

/**
 * Created by hadihariri on 25/08/16.
 */

val String.hasAmpersand: Boolean
    get() = this.contains("&")


fun main(args: Array<String>) {

    println("Hello".hasAmpersand)
    println("Hello & Bye".hasAmpersand)
}