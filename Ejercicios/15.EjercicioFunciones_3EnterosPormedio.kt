package Ejercicios

import Marzo10.valorMayor

fun main(){
    print("Ingresa el numero 1: ")
    val n1 = readLine()!!.toInt()
    print("Ingresa el numero 2: ")
    val n2 = readLine()!!.toInt()
    print("Ingresa el numero 3: ")
    val n3 = readLine()!!.toInt()
    val resultado = promedio(n1, n2, n3)
    println("El promedio es: $resultado")
}
fun promedio(num1: Int, num2: Int, num3: Int): Float{
    val promedioNum=(num1+num2+num3)/3
    return promedioNum.toFloat()
}