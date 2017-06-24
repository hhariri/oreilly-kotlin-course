package com.hadihariri.kotlincourse.interop

import java.io.IOException


enum class Status {
    Current,
    Past
}
data class CustomerKotlin(val id: Int, val name: String, var email: String) {
    fun changeStatus(status: Status) {

    }

    fun preferential() {

    }

    @Throws(exceptionClasses = IOException::class)
    fun loadStatistics(filename: String) {
        throw IOException()
    }
}