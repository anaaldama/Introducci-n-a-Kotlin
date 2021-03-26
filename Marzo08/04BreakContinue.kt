package Marzo08

fun main(){
    println("-------------------------------------")
    for(elemento: Int in 1..5){
        if(elemento==3){
            continue
        }
        println(elemento)
    }
    println("-------------------------------------")
    for(elemento: Int in 1..5){
        if(elemento==3){
            break
        }
        println(elemento)
    }
    println("-------------------------------------")
    //loop@for(contador1: Int in 1..2){
    for(contador1: Int in 1..2){
        for(contador2: Int in 1..5){
            println("Contador1 es $contador1")
            if(contador2==2){
               // break@loop
                break
            }
        }
    }
}