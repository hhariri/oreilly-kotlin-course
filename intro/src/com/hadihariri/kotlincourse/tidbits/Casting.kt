package com.hadihariri.kotlincourse.tidbits

/**
 * Created by hadihariri on 24/08/16.
 */

open class Person {

}

class Employee: Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor: Person() {

}


var input: Any = 10

fun main(args: Array<String>) {

    val str = input as? String





}