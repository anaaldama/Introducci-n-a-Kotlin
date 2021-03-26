package Ejercicios

fun main(){
    val scoville1= 0..699
    val scoville2= 700..2999
    val scoville3= 3000..24999
    val scoville4= 25000..69999
    val scoville5= 0..69999
    var x=0
    var sumaScoville1=0
    var sumaScoville2=0
    var sumaScoville3=0
    var sumaScoville4=0
    var sumaScoville5=0

    print("Ingresa la cantidad de valores:")
    val cantValores= readLine()!!.toInt()

    for(elemento in 1..cantValores){
        println("Ingrese el valor [$elemento]: ")
        var valor= readLine()!!.toInt()

        when(valor){
            in scoville1->sumaScoville1++
            in scoville2->sumaScoville2++
            in scoville3->sumaScoville3++
            in scoville4->sumaScoville4++
            !in scoville5->sumaScoville5++
        }
    }
    println("Números en escala Scoville de 0-699 :$sumaScoville1")
    println("Números en escala Scoville de 700..2999 :$sumaScoville2")
    println("Números en escala Scoville de 3000..24999 :$sumaScoville3")
    println("Números en escala Scoville de 25000..69999 :$sumaScoville4")
    println("Números en escala Scoville mayor a 69999 :$sumaScoville5")
}
