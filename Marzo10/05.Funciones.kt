package Marzo10

fun main(){

   val result=entera( 43)
   println(result)

    print("Ingresa el numero 1: ")
    val n1 = readLine()!!.toInt()
    print("Ingresa el numero 2: ")
    val n2 = readLine()!!.toInt()
    print("Ingresa el numero 3: ")
    val n3 = readLine()!!.toInt()
    val resultado = valorMayor(n1, n2, n3)
    println("El valor mayor es $resultado")
}
fun entera(x:Int):Int{
    return 2 * x
}

fun valorMayor(num1: Int, num2: Int, num3: Int): Int{
    if (num1 > num2 && num1 > num3) {
        return num1
    } else {
        if (num2 > num3) {
            return num2
        } else {
            return num3
        }
    }
}