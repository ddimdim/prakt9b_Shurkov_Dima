package Products

open class Klient(var name:String){
    open fun Count(product: Product, num:Int){
        try {
            var count = 0
            var newprice = 0.0
            while (count <= 0) {
                println("Введите в каком количестве вы хотите купить товар ${product.name}")
                count = readLine()!!.toInt()
                if (count <= 0) println("Меньше 1 товара купить нельзя")
            }
            newprice = count * product.price
            println("Заказ №$num оформлен. Заказ на имя $name. Общая сумма заказа составляет $newprice")
        }
        catch (e:Exception)
        {
            println("Данные были введены неверно")
        }
    }
}