package com.hadihariri.kotlincourse.metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.memberProperties

/**
 * Created by hadihariri on 26/08/16.
 */

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}
fun main(args: Array<String>) {


/*
    val classInfo = Transaction::class

    classInfo.memberProperties.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("Constructor ${it.name} - ${it.parameters}")
    }

    getKotlinType(Transaction::class)
*/

    val constructor = ::Transaction

    println(constructor)


    val idParam = constructor.parameters.first { it.name == "id"}
    val amountParam = constructor.parameters.first { it.name == "amount" }

    val transaction = constructor.callBy(mapOf(idParam to 1, amountParam to 2000))

    val trans = Transaction(1, 20.0 , "New Value")


    val nameProperty = Transaction::class.members.find { it.name == "description" }

    println(nameProperty?.get(trans))


    // println(transaction.description)
}