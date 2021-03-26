package Ejercicios

fun main(){
    var  aTurnoMatutino = FloatArray(4)
    var  aTurnoVespertino = FloatArray(4)
    val aRango=0..7
    var cont2=0
    var sumaM=0.0f; var sumaV=0.0f;

    for(cont in aRango){
        if(cont<=3) {
            println("Ingresa los sueldos del turno matutino")
            aTurnoMatutino[cont] = readLine()!!.toFloat()
            sumaM+=aTurnoMatutino[cont]
        }else{
            println("Ingresa los sueldos del turno Vespertino")
            aTurnoVespertino[cont2] = readLine()!!.toFloat()
            sumaV+=aTurnoVespertino[cont2]
            cont2++

        }
    }
    println("La suma de los sueldos del turno Matutino es :$sumaM");
    println("La suma de los sueldos del turno Vespertino es :$sumaV");
}