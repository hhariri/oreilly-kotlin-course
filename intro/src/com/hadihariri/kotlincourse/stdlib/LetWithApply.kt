package com.hadihariri.kotlincourse.stdlib

import java.io.File

/**
 * Created by hadihariri on 26/08/16.
 */
fun main(args: Array<String>) {


    val file = File("filename.txt")

    with(file) {

    }

    val string : String? = "Some value"

    string?.let {
        it.length
    }

}