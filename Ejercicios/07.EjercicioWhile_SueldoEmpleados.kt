package Ejercicios

fun main(){
    print("Ingresa la cantidad de empleados:")
    val empleados= readLine()!!.toInt()
    var contador1=0
    var contador2=0
    var suma=0.0
    for(cont  in 1..empleados){
        println("Ingresa El sueldo del empleado $cont:")
        val sueldo= readLine()!!.toDouble()
        if(sueldo>=100 && sueldo<=300){
            ++contador1
        }else if(sueldo>300){
            ++contador2
        }
        suma=suma+sueldo
    }
    println("Empleados con sueldo entre 100 y 300 : $contador1")
    println("Empleados con sueldo mayor a 300 : $contador2")
    println("Importe Total: $suma")
}