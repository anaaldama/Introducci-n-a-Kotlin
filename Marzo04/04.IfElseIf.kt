package Marzo04

fun main(){
    println("Calificación de Programación:")
    val calProg = readLine()!!.toInt()
    println("Calificación de Matemáticas:")
    val calMAte= readLine()!!.toInt()
    println("Calificación de POO:")
    val calPOO= readLine()!!.toInt()
    println("Calificación de Base de Datos:")
    val calBD = readLine()!!.toInt()

    val promedio = (calProg + calMAte + calPOO + calBD )/4
    if(promedio == 10){
        println("Tu resultado es sobresaliente ¡ Felicidades! Tu promedio es de $promedio")
    }else if(promedio >= 9){
        println("Tu resultado es bueno ¡ Felicidades! Tu promedio es de $promedio")
    }else if(promedio >= 6 && promedio <= 8){
        println("Tu resultado es suficiente ¡Bien! $promedio")
    }else{
        println("Tu resultado es insuficiente ¡Échale ganas! $promedio")
    }
}