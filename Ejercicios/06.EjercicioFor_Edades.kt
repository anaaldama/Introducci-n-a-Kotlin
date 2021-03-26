package Ejercicios

fun main(){
    var sumaEdades=0
    var edad=0
    var promedioMatutino=0
    var promedioVespertino=0
    var promedioNocturno=0

    for(cont  in 1..5) {
        print("Ingrese la edad del estudiante $cont del turno matutino:")
        edad= readLine()!!.toInt()

        sumaEdades=sumaEdades+edad
        if(cont==5){
            promedioMatutino = sumaEdades/cont
        }
    }
    sumaEdades=0
    for(cont  in 1..6) {
        print("Ingrese la edad del estudiante $cont del turno vespertino:")
        edad= readLine()!!.toInt()

        sumaEdades=sumaEdades+edad
        if(cont==6){
            promedioVespertino = sumaEdades/cont
        }
    }
    sumaEdades=0
    for(cont  in 1..7) {
        print("Ingrese la edad del estudiante $cont del turno nocturno:")
        var edad= readLine()!!.toInt()

        sumaEdades=sumaEdades+edad
        if(cont==6){
            promedioNocturno = sumaEdades/cont
        }
    }
    println("El promedio del turno Matutino es: $promedioMatutino")
    println("El promedio del turno Vespertino es: $promedioVespertino")
    println("El promedio del turno Nocturno es: $promedioNocturno")
    if(promedioMatutino>promedioNocturno && promedioMatutino>promedioVespertino){
        print("El promedio del turno matutino es mayor")
    }else if(promedioVespertino>promedioNocturno){
        print("El promedio del turno vespertino es mayor")
    }else{
        print("El promedio del turno nocturno es mayor")
    }

}