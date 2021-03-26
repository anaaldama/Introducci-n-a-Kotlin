package Marzo03

fun main(){
    print("Ingresa el primer numero: ")
    val num1 = readLine()!!.toInt()
    print("Ingresa el segundo numero: ")
    val num2 = readLine()!!.toInt()

    val resultado= num1 + num2

    println("El resultado es $resultado")

    print("Ingresa el tercer numero: ")
    val num3 = readLine()!!.toDouble()
    print("Ingresa el cuarto numero: ")
    val num4 = readLine()!!.toDouble()

    val resultadoDouble= num3 + num4

    println("El resultado es $resultadoDouble")

    val jerarquia=num1+num2*num3-1
    val jerarquia2=num1/num2*num3-1
    val jerarquia3=num1/(num2*num3)-1

    println("El resultado es: $jerarquia")
    println("El resultado es: $jerarquia2")
    println("El resultado es: $jerarquia3")
}