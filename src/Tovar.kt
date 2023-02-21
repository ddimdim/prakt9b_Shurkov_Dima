package Products

open class Tovar( name: String, var info:String, var guarantee:Int, price:Double) : Product(name, price){
    override fun GetInfo(){
        println("$name стоит $price руб\nИнформация о данном товаре: $info\nГарантия $guarantee месяцев")
    }
}