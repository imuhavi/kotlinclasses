package com.example.kotlinclasses.methodoverloading

class Arithmetic {

    fun add(num1:Int, num2:Int){
        println("Sum of two numbers is : ${num1 + num2}")
    }
    fun add(num1:Int, num2:Int,num3:Int){
        println("Sum of three numbers is : ${num1 + num2 + num3}")

    }
    fun add(num1:Double, num2:Double){
        println("The sum of two numbers with decimal places is ${num1 + num2}")
    }
}