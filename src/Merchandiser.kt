package Products

open class Merchandiser(var name:String) {

    fun Add(product: Product){
        println("Товаровед $name добавлил новый товар ${product.name}")
    }
    fun Oplata()
    {
        println("Товаровед $name зарегистрировал продажу\nОплата прошла успешно")
    }
    fun NoOplata(klient: Klient){
        println("За неуплату товара ${klient.name} попадает в черный список")
    }
}