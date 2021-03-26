package Marzo09

fun main(){

    //sintáxi 1
    println("Sintaxi 1:")
    var  array0= Array(10){2}
    for(indice in 0..4){
        println(array0[indice])
    }

    val arrayFrutas = Array(2){""}
    for(indice in 0..1){
        println("Ingresa la fruta en el índice $indice:")
        arrayFrutas[indice] = readLine()!!
    }
    for(indice in 0..1){
        println("La fruta en el [$indice] es: ${arrayFrutas[indice]}")
    }

    //Sintáxi 2
    println("Sintaxi 2:")
    var  array = arrayOfNulls<Int>(10)
    array[1] = 2
    array[2] = 3
    array[3] = 4
    array[4] = -5

    println("Valor en indice 3:${array[3]}")
    for(i in array){
        println(i)
    }

    //Sintaxi 3
    println("Sintaxi 3:")
    val array1 = IntArray(5)//tamaño 5
    for(i in array1){
        println(i)
    }

    //Sintaxi 4
    println("Sintaxi 4:")
    val array2 = arrayOf(1,2,3,4,5)
}