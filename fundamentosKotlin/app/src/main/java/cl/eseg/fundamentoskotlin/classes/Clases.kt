package cl.eseg.fundamentoskotlin.classes

import cl.eseg.fundamentoskotlin.newTopic

fun main() {
    newTopic("Clases")

    val phone: Phone = Phone(123456789)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    newTopic("Herencia")

    val smartphone = Smartphone(345678912, true)
    smartphone.call()

    newTopic("Sobreescritura")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")

    newTopic("Data Classes and Enum Classes")
    val myUser = User(0, "Enrique", "Solis", Group.FAMILY)
    val sister = myUser.copy(id = 1, name = "Claudia")
    val friend = User(2, "Flavio", "Canales", Group.FRIEND)
    println(myUser.component3())
    println(myUser)
    println(sister)
    println(friend)

    newTopic("Funciones de Alcance")
    with(smartphone) {
        println("Privado? ${isPrivate}")
        call()
    }

    /*friend.group = Group.WORK
    friend.name = "Fivecro"
    friend.lastName = "Maestrus"*/
    friend.apply {
        group = Group.WORK
        name = "Fivecro"
        lastName = "Maestrus"
    }
    println(friend)

    newTopic("Homework")
    val libro = Libro(0, "Harry Potter y la Piedra Filosofal", "Prueba", "JK Rowling", 30, true)
    libro.mostrarDetalle()

}