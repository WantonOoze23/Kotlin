package Main

import kotlin.reflect.typeOf

fun main(){
// simple variables
    var age = 15 // posible to change
    val name = "John" //imposible to change

    println("Hello my name's $name! I`m $age")


    //name = "asda" incorect
    age = 16

//variables that have own type
    var num: Int = 10
    var doule: Double = 1.123
    var float: Float = 3.14F
    var char: Char = 'A'
    var bool: Boolean = true
    var str: String = "Hello people"
    println(bool)
    //numbers that have ranges
    val b: Byte = 100 // -128 -> 127

    val s: Short = 20000 // -32768 -> 32767

    val i: Int = 10000 // -2147483648 -> 2147483647

    val l: Long = 1020301300011111111 // -9223372036854775808 -> 9223372036854775807

    num = 120
    println(num)

    var x: Int = 10
    var y: Long = x.toLong()

    println(y)
}
