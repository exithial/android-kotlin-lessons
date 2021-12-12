package cl.eseg.fundamentoskotlin

const val separator = "===================="

fun main() {
    //println("Hola Kotlin")
    newTopic("Hola Kotlin")

    newTopic("Variables y Constantes")

    //val a = 2
    //val a = "Hola"
    val a = true
    println("a = $a")

    //var  b = 2
    var b: Int
    b = 5
    println("b = $b")

    var objNull: String?
    objNull = null
    //objNull = "Hi"
    println("objNull = $objNull")

    var objAny: Any?
    objAny = null
    objAny = "Hi"
    objAny = true
    objAny = 5
    println("objAny = $objAny")

    //sayHello()
}

fun newTopic(topic: String) {
    /*println()®
    print("==================== ")
    print(topic)
    print(" ====================")
    println()*/

    print("\n$separator $topic $separator\n")
}