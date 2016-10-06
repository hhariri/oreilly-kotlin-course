package com.hadihariri.kotlincourse.stdlib

import java.util.*

/**
 * Created by hadihariri on 25/08/16.
 */


fun main(args: Array<String>) {

    val numbers = 1..100

    val cities = listOf("Madrid", "London", "Paris")

    val mutableCities = mutableListOf("Madrid")

    mutableCities.add("London")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Paris", "France"))

    val booleans = booleanArrayOf(true, false, true)
    val characters = charArrayOf('A', 'B', 'C')


}