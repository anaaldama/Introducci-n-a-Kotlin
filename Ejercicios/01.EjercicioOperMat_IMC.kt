package Ejercicios
//Desarrolle un programa que calcule el IMC
fun main(){
    println("IMC por Kg-Mts.")
    println("Ingresa el peso en Kg.:")
    val peso= readLine()!!.toDouble()
    println("Ingresa la altura en Mts.:")
    val altura= readLine()!!.toDouble()
    var IMC=peso/(altura*altura)

    if(IMC<18.5){
        println("Bajo peso: menos de 18.5")
    }else if(IMC>=18.5 && IMC<=24.9){
        println("Normal: entre 18.5 y 24.9")
    }else if(IMC >=25 && IMC<=29.9){
        println("Sobrepeso: entre 25 y 29.9")
    }else{
        println("Obesidad: 30 o más")
    }
}