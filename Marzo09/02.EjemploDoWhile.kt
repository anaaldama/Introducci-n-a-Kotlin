package Marzo09
fun main(){
    val numAleatorio:Int
    var adivina:Int
    var intentos=0
    numAleatorio=(Math.random()*100).toInt()+1

    do{
        print("Ingresa un número entre 1 y 100: ")
        adivina= readLine()!!.toInt()
        intentos++
        if(adivina>numAleatorio){
            println("¡Muy alto! Intenta de nuevo")
        }else if(adivina<numAleatorio){
            println("¡Muy bajo! Intenta nuevamente")
        }else{
            println("¡Correcto! Lo conseguiste es $intentos intentos")
        }
    }while(adivina!=numAleatorio)

}
