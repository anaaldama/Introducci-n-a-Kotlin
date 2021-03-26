package Ejercicios

fun main(){
    var contador=0
    var numero=1
    var suma=0

    while(contador==0){
        println("Ingrese un número entero:")
        numero= readLine()!!.toInt()

        suma=suma+numero
        if(numero==0){
            break
        }
    }
    println("La suma de los números es: $suma")
}