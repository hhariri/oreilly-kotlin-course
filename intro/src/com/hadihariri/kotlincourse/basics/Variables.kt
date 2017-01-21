package com.hadihariri.kotlincourse.basics

/**
 * Created by hadihariri on 24/08/16.
 */


fun main(args: Array<String>) {

    var streetNumber = 10
    var streetName = "High Street"

    val zip = "E11 P1"

    streetName = "Pudding Lane"

    val myLong = 10L
    val myFLoat = 100F
    val myHex = 0x0F
    val myBinary = 0b01

    val myInt = 100
    val myLongAgain: Long = myInt.toLong()


    // String

    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new linke \n"

    val rawString = "Hello" +
            "This is second line" +
            "A third line"

    val multipleLines = """
             This is a string
            And this is another line
            """

    val years = 10
    val message = "A decade is $years years"

    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}"


}
