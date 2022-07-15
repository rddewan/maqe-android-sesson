package com.example.maqedemo.oop

class Cat constructor(val name: String = "", val age: Int = 0, val breed: String = "") {
    val legs = 4
    val ears = 2

    init {
        print("1st init")
    }

    init {
        print("2nd init")
    }


    constructor(name: String): this(name,0,"") {
        print("2nd constructor")
        // cll something
    }

    constructor(name: String,age: Int): this(name){
        print("3nd constructor")
    }


}