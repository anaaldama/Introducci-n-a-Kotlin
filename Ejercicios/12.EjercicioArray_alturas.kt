package Ejercicios

fun main(){
    println("¿Cuántas alturas deseas capturar?: ")
    val cantAlturas = readLine()!!.toInt()

    var  arrayPersonas = FloatArray(cantAlturas)
    var suma=0.0f
    var contarMayor=0
    var contarMenor=0

    for(indice in  arrayPersonas.indices){
        println("Ingresa la altura en la posición [$indice] : ")
        arrayPersonas[indice] = readLine()!!.toFloat()
        suma+= arrayPersonas[indice]
    }
    var promedio=suma/cantAlturas
    for(x in arrayPersonas.indices){
        if(arrayPersonas[x] > promedio){
            contarMayor++
        }else{
            contarMenor++
        }
    }
    println("El promedio es: %.2f".format(promedio))
    println("Hay $contarMayor persona(s) mas alta(s) que el promedio")
    println("Hay $contarMenor persona(s) menor(es) al promedio")
}