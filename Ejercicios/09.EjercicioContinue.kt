package Ejercicios

fun main(){
    println("Cantidad de numeros a ingresar positivos:")
    val elementos= readLine()!!.toInt()
    var suma=0
    for(contador in 1..elementos){
        println("Ingrese el número $contador de $elementos :")
        var numero= readLine()!!.toInt()

        if(numero>=0){
            suma=suma+numero
        }else{
            continue
            println("Números no validos")
        }
    }
    println("La suma de los numeros positivos es: $suma")
}