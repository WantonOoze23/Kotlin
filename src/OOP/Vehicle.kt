package OOP

open class Vehicle (var brand: String, var model: String, var color: String, var price: Int){
    open fun display() {
        println("$brand, $model, $color, price : $price")
    }
}


class Car(brand: String, model: String,color: String, price: Int): Vehicle(brand, model, color, price) {



}

fun createCar(): Car{
    println("Enter name of the car:")
    val name: String = readLine().toString()
    println("Enter model of the car:")
    val model: String = readLine().toString()
    println("Enter color of the car:")
    val coloe: String = readLine().toString()
    println("Enter price of the car:")
    val price: Int = readLine()!!.toInt()// we use !! to say that we 100% sure it might be certain type

    return Car(name, model, coloe, price)
}

fun main() {

    val bmw = Car("BMW", "X5","Black", 23000)
    val truck = Vehicle("Man", "XF+", "Blue", 120000)

    bmw.display()
    truck.display()

    //instead of using array use mutablelist, which is dynamic and can be changed
    val carList: MutableList<Vehicle> = mutableListOf(bmw, truck)



    val newCar = createCar()

    carList.add(newCar)

    for (car in carList) {
        car.display()
    }
}