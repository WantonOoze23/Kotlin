package Basic

fun main(){
    while (true){
        var choice: Int? = null
        while (choice == null){
            println("\n1. First\n2. Second")
            choice = readLine()?.toIntOrNull()
        }
        when(choice){
            1 -> first()
            2 -> second()
            else -> println("Wrong input")
        }
    }

}


fun first(){
    var counter = 0
    while (counter <= 100){
        if (counter % 5 == 0 && counter % 3 == 0){
            println("fizz")
        } else if (counter % 5 == 0){
            println("buzz")
        } else if (counter % 3 == 0){
            println("fizzbuzz")
        } else println(counter)
        counter++
    }
}

fun second(){
    for (counter in 0..100){
        println(
            when{
                counter % 15 == 0 -> "fizzbuzz"
                counter % 3 == 0 -> "fizz"
                counter % 5 == 0 -> "buzz"
                else -> counter
            }
        )
    }
}