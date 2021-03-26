package Marzo11

fun main(){

    val resultado = sum(5,58)
    val resultado2 = sum(2,4,7)
    val resultado3 = sum(3,5,7,9)
    println("La funcion sum con 2 parametros arroja: $resultado")
    println("La funcion sum con 3 parametros arroja: $resultado2")
    println("La funcion sum con 4 parametros arroja: $resultado3")
}

fun sum(num1:Int,num2:Int):Int{
    val suma:Int = num1 +num2
    return suma
}
fun sum(num1:Int,num2:Int, num3:Int):Int{
    val suma:Int = num1 + num2 + num3
    return suma
}
fun sum(num1:Int,num2:Int, num3:Int, num4:Int):Int{
    val suma:Int = num1 + num2 + num3 + num4
    return suma
}