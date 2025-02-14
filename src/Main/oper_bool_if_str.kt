package Main

fun main(){
    var x = 10 + 15

    var greating: String = "Hello!"

    println(greating + "\nLength is " + greating.length)
    println(greating[3])

    if (x > 25){
        println("x is greater than 25")
    } else if (x < 25){
        println("x is less than 25")
    } else {
        println("x equals 25")
    }


    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
}
