import Products.*

fun main(){
    println("Добро пожаловать в магазин (недоDNS)")
    var plata = ""
    var merchandiser = Merchandiser("Андрей Ковязин")
    var klientone = Klient("Дима")
    var klienttwo = Klient("Кирилл")
    var klientthree = Klient("Катя")
    var productone = Product("Микроволновка", 12499.0)
    var producttwo = Product("Тостер", 1999.0)
    var productthree = Product("Холодильник", 20999.0)
    merchandiser.Add(productone)
    merchandiser.Add(producttwo)
    merchandiser.Add(productthree)
    var tovarone = Tovar( "${productone.name}","Электроприбор, позволяющий совершать разогрев водосодержащих веществ...",60,12499.0)
    println(tovarone.GetInfo())
    klientone.Count(productone, 52792579)
    var tovartwo = Tovar("${producttwo.name}","Предназначенн для быстрого поджаривания плоских кусков хлеба...", 24, 1999.0 )
    println(tovartwo.GetInfo())
    klienttwo.Count(producttwo, 41908310)
    var tovarthree = Tovar("${productthree.name}", "Поддерживает низкую температуру в теплоизолированной камере...", 120, 20999.0 )
    println(tovarthree.GetInfo())
    klientthree.Count(productthree, 49814091)
    while(plata!= "Да" && plata!= "Нет") {
        println("${klientone.name} оплатил заказ(Да или Нет)?")
        plata = readLine()!!.toString()
        if (plata == "Да") merchandiser.Oplata()
        else if (plata == "Нет") merchandiser.NoOplata(klientone)
        else println("Введите Да или Нет")
    }
    plata = ""
    while(plata!= "Да" && plata!= "Нет") {
        println("${klienttwo.name} оплатил заказ(Да или Нет)?")
        plata = readLine()!!.toString()
        if (plata == "Да") merchandiser.Oplata()
        else if (plata == "Нет") merchandiser.NoOplata(klienttwo)
        else println("Введите Да или Нет")
    }
    plata = ""
    while(plata!= "Да" && plata!= "Нет") {
        println("${klientthree.name} оплатил заказ(Да или Нет)?")
        plata = readLine()!!.toString()
        if (plata == "Да") merchandiser.Oplata()
        else if (plata == "Нет") merchandiser.NoOplata(klientthree)
        else println("Введите Да или Нет")
    }
}