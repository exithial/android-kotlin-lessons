package cl.eseg.fundamentoskotlin

fun main() {
    newTopic("Bucles")
    showPersons("Angel", "Mary", "Fany")
    showPersons("Marco", "Antonio", "Sergio", "Alex", "Carla")
}

fun showPersons(p1: String, p2: String, p3: String) {
    println(p1)
    println(p2)
    println(p3)
}

fun showPersons(vararg persons: String) {
    newTopic("For")
    for (person in persons) println(person)

    newTopic("While")
    var index = 0

    while (index < persons.size) {
        if (persons[index] == "Antonio") println("Es Antonio!")
        println(persons[index])
        index++
    }

    newTopic("When")
    index = (0..persons.size -1).random()
    println(index)
    when (persons[index]) {
        "Marco" -> println("Es Marco!")
        "Antonio" -> {
            println("Ir a otra pantalla")
            println(2 + 4)
        }
        else -> println(persons[index])
    }
}