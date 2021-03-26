package Marzo10

fun main() {
    println("---HashMapOf---")
    val hashmap = hashMapOf(1 to "Román", 2 to "Cecilia")
    hashmap.put(30, "Luis")
    println(hashmap)
    println("---ArrayOf---")
    val letras = arrayOf("a", "b", "c")
    letras[1] = "z"
    for (i in 0..letras.size-1){
        println(letras[i])
    }
    println("---ListOf---")
    val nums = listOf(0,1,2,-12,-30)
    //nums[4] = 100
    for (elementos in nums){
        println(elementos)
    }
    println("---MutableListOf---")
    val nums2 = mutableListOf(0,1,2,-12,-30)
    nums2[4] = 100
    for (elementos in nums2){
        println(elementos)
    }
    println("---setOf---")
    val setof = setOf(1,2,4,0,50,50,4,2,3)
    for(elemento in setof){
        println(elemento)
    }
    println("---MutableSetOf---")
    val mutablesetof = mutableSetOf(51,2,3,23,51,2)
    mutablesetof.add(40)
    for(elemento in mutablesetof){
        println(elemento)
    }
    println("-------------")
    val nums3 = listOf(1,2,3,4,5,6)
    for (elementos in nums3){
        println(elementos)
    }
    println("-------------")
    for((indice,elemento)in nums3.withIndex()){
        println("$indice : $elemento")
    }
}