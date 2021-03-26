package Marzo04

fun main(){
    println("Ingresa el primer valor")
    val num1 = readLine()!!.toInt()
    println("Ingresa el segundo valor")
    val num2 = readLine()!!.toInt()

    var resultado : Int?

    if(num1 > num2){
        resultado = num1
    }else{
        resultado =num2
    }
    //**** Otra opcion  ************
    if(num1 > num2)
        resultado = num1
    else
        resultado =num2
    //**** Otra opcion ***************
    resultado=if(num1>num2) num1 else num2

    println("El valor mayor es: $resultado")


}