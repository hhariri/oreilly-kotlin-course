package com.hadihariri.kotlincourse.generics

import com.hadihariri.kotlincourse.classes.Customer
import java.io.Serializable

/**
 * Created by hadihariri on 25/08/16.
 */

open class Entity(val id: Int)

class Repository<T: Entity> {
    fun save(entity: T) {
        if (entity.id != 0) {
            // ....
        }
    }

}

fun <T: Serializable> streamObject(obj: T) {

}

fun main(args: Array<String>) {

}

