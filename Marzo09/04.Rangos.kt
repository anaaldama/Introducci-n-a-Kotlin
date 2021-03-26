package Marzo09

fun main(){
    print("Hasta qué numero deseas imprimir:")
    val limiteNumero:Int = readLine()!!.toInt()

    print("En incrementos de :")
    val incremento:Int = readLine()!!.toInt()

    for(i:Int in 0..limiteNumero step incremento){
        println(i)
    }
    println();

    for(elemento: Int in 1 until 16){
        println(elemento)
    }
    println();

    val nums:IntRange= 1..50
    for(elemento:Int in nums step 10){
        println(elemento)

    }
    println("El conteo es de: ${nums.count()} eleementos")
    println();


    val chars:CharRange ='A'..'z'
    for(elemento:Char in chars){
        println(elemento)
    }
    println();

    val range:IntRange =1..10
    println("Total de items = ${range.count()}")
    println("suma de rango = ${range.sum()}")
    println("Promedio de rango = ${range.average()}")
    println("Valor maximo = ${range.maxOrNull()}")
    println("Valor minimo = ${range.minOrNull()}")
}