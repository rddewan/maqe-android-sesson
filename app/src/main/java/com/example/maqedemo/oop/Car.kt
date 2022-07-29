package com.example.maqedemo.oop

class Car(c:String,w:Int): Vehicle(c,w) {

    override fun drive() {
        super.drive()
        println("Car can drive fast")

    }

    fun openWindow() {
        println("car can open window")
    }

    public override fun startEngine() {
        //super.startEngine()
        println("Car ca start engine")
    }

    override fun sharedData() {
        super.sharedData()
    }
}