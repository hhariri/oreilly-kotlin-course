@file:JvmName("UtilityClass")
package com.hadihariri.kotlincourse.interop

/**
 * Created by hadihariri on 25/08/16.
 */

const val CopyrightYear = 2016

fun prefix(prefix: String, value: String): String {
    return "$prefix-$value"
}

