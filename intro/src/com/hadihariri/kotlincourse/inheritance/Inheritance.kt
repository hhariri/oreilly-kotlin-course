package com.hadihariri.kotlincourse.inheritance

import com.sun.xml.internal.rngom.parse.host.Base

/**
 * Created by hadihariri on 24/08/16.
 */

open class Person() {
    open fun validate() {

    }
}

open class Customer: Person {
    final override fun validate() {

    }

    constructor(): super() {

    }

}

class SpecialCustomer: Customer() {

}

data class CustomerEntity(val name: String): Person()

fun main(args: Array<String>) {

    val customer = Customer()

    customer.validate()
}