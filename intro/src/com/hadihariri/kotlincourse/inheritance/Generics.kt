package com.hadihariri.kotlincourse.inheritance

/**
 * Created by hadihariri on 24/08/16.
 */

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {

    val customerRepo = GenericRepository<Customer>()

    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()





}
