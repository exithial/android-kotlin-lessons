package cl.eseg.fundamentoskotlin

import cl.eseg.fundamentoskotlin.classes.Group
import cl.eseg.fundamentoskotlin.classes.User

fun main() {
    newTopic("Colecciones")

    newTopic("Solo lectura")
    val frutaList = listOf("Manzana", "Banana", "Uva", "Lima")
    println(frutaList[(frutaList.indices).random()])
    println("Index de Uva es ${frutaList.indexOf("Uva")}")

    newTopic("Mutable List")
    val myUser = User(0, "Enrique", "Solis", Group.FAMILY)
    val sister = myUser.copy(id = 1, name = "Claudia")
    val friend = User(2, "Flavio", "Canales", Group.FRIEND)

    val usersList = mutableListOf(myUser, sister)
    println(usersList)
    usersList.add(friend)
    println(usersList)
    //usersList.removeAt(1)
    usersList.remove(myUser)
    println(usersList)

    val userSelectedList = mutableListOf<User>()
    println(userSelectedList)
    //userSelectedList.addAll(usersList)
    userSelectedList.add(myUser)
    println(userSelectedList)
    userSelectedList[0] = sister
    println(userSelectedList)
    userSelectedList.add(myUser)
    userSelectedList.add(myUser)
    println(userSelectedList)

    newTopic("Map")
    val usersMap = mutableMapOf<Int, User>()
    println(usersMap)
    usersMap.put(myUser.id.toInt(), myUser)
    usersMap.put(myUser.id.toInt(), myUser)
    println(usersMap)
    usersMap.put(friend.id.toInt(), friend)
    println(usersMap)
    usersMap.remove(2)
    println(usersMap)
    println(usersMap.isEmpty())
    println(usersMap.containsKey(0))
    usersMap.put(sister.id.toInt(), sister)
    usersMap.put(friend.id.toInt(), friend)
    println(usersMap)
    println(usersMap.keys)
    println(usersMap.values)
}