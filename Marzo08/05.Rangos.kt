package Marzo08

fun main(){
    val nums =1..1000

    for(elemento in nums step 150){
        println(elemento)
    }
    for(elemento in nums.reversed() step 100){
        println(elemento)
    }
    var nums2 = 15 downTo 1 step 3
    for(elemento:Int in nums2){
        println(elemento)
    }
}