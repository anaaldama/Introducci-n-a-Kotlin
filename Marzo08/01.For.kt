package Marzo08

fun main(){
    for(elemento in 1..5){
        println("EL elemento actual es $elemento")

        if(elemento == 3){
            println("El elemento encontrado");
        }
    }
    for(contador1 in 1..5){
        println("contador 1 es $contador1");
        for(contador2 in 1..5){
            println("contador 2 es $contador2")
        }
        println("For anidado concluido");
    }
    println("El ciclo For ha terminado");
}