package Ejercicios
//puntaje obtenido en el lanzamiento de tres dados
fun main(){
    println("Ingres el valor del dado 1:")
    val dado1= readLine()!!.toInt()
    println("Ingres el valor del dado 2:")
    val dado2= readLine()!!.toInt()
    println("Ingres el valor del dado 3:")
    val dado3= readLine()!!.toInt()


    if(dado1==6 && dado2==6 && dado3==6){
        println("Excelente")
    }else if((dado1==6 && dado2==6) || (dado1==6 && dado3==6) ||(dado2==6 && dado3==6)){
        println("Muy bien")
    }else if(dado1==6 || dado2==6 || dado3==6){
        println("Regular")
    }else{
        println("Pésimo")
    }
}