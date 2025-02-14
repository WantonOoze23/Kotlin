package Main

fun main() {

    var x = 0
    while (x < 10) {
        println("x = " + x)
        x++
    }

    var y = 0
    do{
        println("y = " + y)
        y++
    } while (y < 10)

    val leters = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')

    println(leters[0])

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (c in cars) {
        println(c)
    }

    for (chars in 'a'..'k') {
        println(chars)
    }
}