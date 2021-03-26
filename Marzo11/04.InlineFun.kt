package Marzo11

fun Suma(a:Int, b:Int):Int = a+b

fun maximo (num1:Int, num2:Int)= if(num1>num2) num1 else num2

fun main(){
    val resultado:Int =Suma(255,362)
    println(resultado)

    val maximo =maximo(345,564)
    println(maximo)
}