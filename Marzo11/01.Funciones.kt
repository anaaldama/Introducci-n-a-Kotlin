package Marzo11

fun main(){
 val resultado = suma(25,89)
    println("La sumatoria es $resultado")
}

fun powerOf(numero: Int, exponente:Int){

}
fun printHello(nombre:String?){
    if(nombre!=null){
        println("Hola $nombre")
    }else{
        println("Hola")
    }
}
fun suma(num1:Int, num2: Int):Int{
    val suma:Int= num1+num2
    return suma
}

//Se puede o no indicar el Unit
fun sinparametros():Unit{
    println("Hola, Soy una función sin parámetros")
}