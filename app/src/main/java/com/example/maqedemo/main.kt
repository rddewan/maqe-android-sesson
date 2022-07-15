package com.example.maqedemo

import com.example.maqedemo.oop.Person


fun main() {
    /*val dog = Dog()
    val ears = dog.ears
    dog.name = "Tiger"
    println(ears)

    val cat = Cat("Mee",2)*/

    val person = Person("richard","dewan")
    person.fullName = "Rob Van"
    println(person.fullName)
    println( person.phone)
    // null safe call
    println( person.phone?.length)

    person.sub(10,20)
    // named parameters
    person.sub(b = 20, a = 10)


}