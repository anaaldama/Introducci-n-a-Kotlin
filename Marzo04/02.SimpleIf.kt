package Marzo04

fun main(){
    println("¿Cuál es tu sueldo?");
    val sueldo = readLine()!!.toDouble()

    if(sueldo > 1000){
        println("¡Debes de pagar impuestos!")
    }

}