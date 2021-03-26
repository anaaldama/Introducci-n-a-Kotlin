package Ejercicios

fun main(){
    println("Ingrese el total de preguntas del Test:")
    val cantidadPreg= readLine()!!.toInt()
    println("Ingrese el total de preguntas contestadas correctamente:")
    val totalCorrectas= readLine()!!.toInt()

    val porcentaje=(totalCorrectas*100)/cantidadPreg
    println("Porcentaje obtenido: $porcentaje")

    if(porcentaje>=90){
        println("Nivel máximo")
    }else if(porcentaje>=75 && porcentaje<90){
        println("Nivel medio")
    }else if(porcentaje>=50 && porcentaje<75){
        println("Nivel regular")
    }else{
        println("Fuera de nivel")
    }

}