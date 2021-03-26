package Marzo03

fun main(){
    println("¿Cual es tu nombre?")
    val nombre= readLine()

    println(nombre)

    println("¿Cuáles tu edad?")
    val edad: Int= readLine()!!.toInt()
    println(edad)
}