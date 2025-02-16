package Basic

fun intervalInSeconds(hours: Int = 0 , minutes: Int = 0, seconds: Int = 0): Int{
    return hours * 3600 + minutes * 60 + seconds
}

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(hours = 10))
    println(intervalInSeconds(hours = 1,  seconds = 1))
}