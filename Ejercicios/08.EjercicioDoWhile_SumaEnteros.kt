package Ejercicios
fun main(){
    println("Ingrese el numero de elementos enteros:")
    val elemento= readLine()!!.toInt()
    var cont=1
    var suma=0
    do{
        println("Ingrese el número $cont de  $elemento")
        var numero= readLine()!!.toInt()
        suma=suma+numero
        cont++;
    }while(cont<=elemento)

    println("La suma de los $elemento numeros enteros es: $suma")
}
