package com.hadihariri.kotlincourse.generics

import com.hadihariri.kotlincourse.delegation.Customer

/**
 * Created by hadihariri on 25/08/16.
 */

open class Person
class Employee: Person()

fun operate(person: List<Person>) {

}

interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

interface WriteRepo<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}


fun main(args: Array<String>) {

    operate(listOf<Employee>())
    operate(listOf<Person>())

    val ro = ReadOnlyRepoImpl<Customer>()

    ro.getAll()


}
