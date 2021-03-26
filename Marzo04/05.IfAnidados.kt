package Marzo04

fun main(){
    println("Ingresa la medida en metros")
    val medida= readLine()!!.toDouble()

    if(medida >= 1.00){
        if(medida > 5.0){
            println("La medida $medida sobrepasa los limites aceptados.")
        }else{
            println("La medida $medida es aceptable")
        }
    }else{
        println("Lo siento, no es aceptable")
    }
}