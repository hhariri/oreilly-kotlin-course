package com.hadihariri.kotlincourse.functions

/**
 * Created by hadihariri on 25/08/16.
 */

fun op(x: Int, op: (Int) -> Int): Int {

    return op(x)
}

fun main(args: Array<String>) {

    op(3, { x -> x * x })

    op(2, fun(x): Int {

        if (x > 10) {
            return 0
        } else {
            return x * x
        }

    })

}