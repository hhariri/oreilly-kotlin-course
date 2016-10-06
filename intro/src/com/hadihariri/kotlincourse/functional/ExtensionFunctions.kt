package com.hadihariri.kotlincourse.functional

import com.sun.xml.internal.rngom.parse.host.Base

/**
 * Created by hadihariri on 24/08/16.
 */

fun String.hello() {
    println("It's me!")
}

fun String.toTitleCase(prefix: String): String {
    return this.split(" ").joinToString(" ") { "$prefix ${it.capitalize()}" }
}

fun main(args: Array<String>) {

    val instance = InheritedClass()

    instance.extension()
}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred(message: String) {
    println(message)
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}

