package Basic

import kotlin.random.Random

data class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int){
    val names = listOf("John", "Jane", "Mary")

    fun generateEmployee() = Employee(names.random(), Random.nextInt(minSalary, maxSalary))
}


fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
    for (number in 1..100){
        println(empGen.generateEmployee())
    }
}