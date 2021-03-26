package Marzo11

fun main(){
    print("Ingresa el numero1:");
    val n1:Int= readLine()!!.toInt()
    print("Ingresa el numero 2:");
    val n2:Int= readLine()!!.toInt()
    print("Ingresa el numero 3:");
    val n3:Int= readLine()!!.toInt()

    val resultado:Int = valorMayor(n1,n2,n3)
    println("El valor Mayor es $resultado")
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