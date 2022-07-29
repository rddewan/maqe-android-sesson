package com.example.maqedemo.oop

fun main() {
    val vehicle = Vehicle("red",4)


    val car = Car("red",4)
    car.drive()
    car.doBreak()
    car.openWindow()
    car.startEngine()
    car.sharedData()

    var person = Person.Men().whoAmI()
    val person1 = Person("","")
    person1.Female()

}