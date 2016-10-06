package com.hadihariri.kotlincourse.delegation

import kotlin.properties.Delegates

/**
 * Created by hadihariri on 25/08/16.
 */

class Veto {
    var value: String by Delegates.vetoable("String") { prop, old, new -> new.startsWith("S")}

}

fun main(args: Array<String>) {

    val veto = Veto()

    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)
}
