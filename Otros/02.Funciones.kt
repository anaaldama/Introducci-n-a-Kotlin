package Otros

fun main() {
    var resultadoCuadra:Int
    var resultadoCubo:Int
    val numero1=10
    resultadoCuadra=cuadra(numero1)
    resultadoCubo=cubo(numero1)
    println("El cuadrado del numero $numero1 es =  $resultadoCuadra")
    println("El cubo del numero $numero1 es =   $resultadoCubo")
}
fun cuadra(num1: Int):Int
{
    return num1*num1
}
fun cubo(num2: Int):Int
{
    return cuadra(num2)*num2
}