package com.hadihariri.kotlincourse.delegation

/**
 * Created by hadihariri on 25/08/16.
 */

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository, logger: Logger): Repository by repository, Logger by logger {


}