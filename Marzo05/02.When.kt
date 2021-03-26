package Marzo05

fun main(){
    val x=16

    when(x){
        1-> {
            println("El valor es 1")
            println("Esta es una accion agregada")
        }
        2-> println("El valor es 2")
        3-> println("El valor es 3")
        in 5.. 15-> println("El valor esta entre 5 y 15")
        !in 5..15-> println("El valor esta fuera de 5 y 15")
        else-> println("El valor está fuera de rango")
    }

    val resultado=when(x){
        1->"El valor es 1"
        2->"El valor es 2"
        3->"El valor es 3"
        in 5..15 ->"El valor esta entre 5 y 15"
        !in 5..15 ->"El valor esta fuera de 5 y 15"
        else ->"El valor está fuera de rango"
    }
    println(resultado)

    println("Calificación de Programación:")
    val calProg = readLine()!!.toDouble()
    println("Calificación de Matemáticas:")
    val calMAte= readLine()!!.toDouble()
    println("Calificación de POO:")
    val calPOO= readLine()!!.toDouble()
    println("Calificación de Base de Datos:")
    val calBD = readLine()!!.toDouble()

    val promedio = (calProg + calMAte + calPOO + calBD )/4
    when(promedio){
        in 9.5..10.0-> println("Tu resultado es sobresaliente ¡ Felicidades! Tu promedio es de $promedio")
        in 9.0..9.49-> println("Tu resultado es bueno ¡ Felicidades! Tu promedio es de $promedio")
        in 6.0..8.99-> println("Tu resultado es suficiente ¡Bien! $promedio")
        else-> println("Tu resultado es insuficiente ¡Échale ganas! $promedio")
    }
}