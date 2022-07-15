package com.example.maqedemo.oop

class Person(val name: String, val lastName: String) {
    var fullName = "$name $lastName"
        get() = "Full Name: $field Length: ${field.length}"
        set(value) {
            field = "Mr. $value"
        }

    var age: Int? =  null
    var phone: String? = null

    fun getFullAddress(): Unit {
        println("This is a full address")
    }

    fun getUserAddress(): String {
        return  "This is a user address"
    }

    fun sub(a:Int, b:Int): String {
        return  "This is a user address"
    }
}