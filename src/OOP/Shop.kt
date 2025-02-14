package OOP

open class Product(var name: String, var price: Int, var quantity: Int) {

    fun restock(amount: Int){
        quantity += amount
    }

    fun sell(amount: Int){
        quantity -= amount
    }

    fun isAvailable(): Boolean{
        return quantity > 0
    }

    open fun display(){
        println("\nName: $name, Price: $$price, Quantity: $quantity")
    }

}

class Smartphone(name: String, price: Int, quantity: Int, var brand: String, var storage: Int): Product(name, price, quantity){

    override fun display() {
        super.display()
        print("Brand: $brand, Storage: $storage GB")
    }


}

class Laptop(name: String,price: Int, quantity: Int, var brand: String, var ram: Int): Product(name, price, quantity){

    override fun display() {
        super.display()
        print(" Brand: $brand, Storage: $ram GB")
    }

}


fun main() {
    val smartphones: MutableList<MutableList<Smartphone>> = mutableListOf()
    var laptops: MutableList<MutableList<Laptop>> = mutableListOf()

    val iphone16: MutableList<Smartphone> = mutableListOf()
    val iphone15: MutableList<Smartphone> = mutableListOf()

    iphone16.add(Smartphone("Iphone 16", 800, 50, "Apple", 256))

    iphone15.add(Smartphone("Iphone 15", 700, 50, "Apple", 256))


    smartphones.add(iphone16)
    smartphones.add(iphone15)

    smartphones.forEach {
        it.forEach {
            it.display()
        }
    }

}

