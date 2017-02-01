package com.hadihariri.kotlincourse.interop

import com.hadihariri.kotlincourse.classes.CustomerJava

/**
 * Created by hadihariri on 25/08/16.
 */

fun main(args: Array<String>) {

    val customer = CustomerJava()

    customer.email = "mail@hadihariri.com"

    customer.prettyPrint()

    customer.neverNull()

    val runnable = Runnable { println("Invoking runnable") }

    val kr = KotlinCustomerRepo()

    val customerJava = kr.getById(10)



}

class PersonKotlin: PersonJava() {

}



class KotlinCustomerRepo: CustomerRepository {
    override fun getById(id: Int): CustomerJava? {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava>? {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}



