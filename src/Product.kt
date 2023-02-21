package Products

open class Product(var name: String, var price: Double) {

    open fun GetInfo(){
        println("$name стоит $price руб за 1 шт")
    }

}