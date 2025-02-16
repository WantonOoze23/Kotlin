package Basic

fun main() {
    val number2word = mapOf(0 to "zero", 1 to "one", 2 to "two")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}