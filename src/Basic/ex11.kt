
import java.lang.Math.pow
import kotlin.math.PI

fun circleArea(r: Int): Double{
    return PI * pow(r.toDouble(), 2.0)
}


fun main() {
    println(circleArea(2))
}