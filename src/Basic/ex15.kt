package Basic

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) action()
}

fun main() {
    val str = "Hello"
    repeatN(5, { println(str) })

}