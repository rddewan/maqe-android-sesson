package com.example.maqedemo.oop

open class Vehicle(private val color:String, val wheel: Int) {
    init {
        setup()
    }

    private fun setup() {
        setColor()
        setWheel()
    }

    open fun drive(){
        println("it can drive")
    }

    fun doBreak() {
        println("it can break")
    }

    protected open fun startEngine(){
        println("It can start the engine")
    }

    protected open fun stopEngine(){
        println("It can stop the engine")
    }

    internal open fun sharedData() {
        println("This is internal fun")
    }

    private fun setColor(){
        println(color)
    }

    private fun setWheel(){
        println(wheel)
    }
}