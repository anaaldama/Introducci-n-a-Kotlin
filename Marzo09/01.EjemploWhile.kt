package Marzo09

fun main(){
    print("¿Cuántos empleados trabajan?")
    val cantEmpleados= readLine()!!.toInt()

    var x=1
    var sueldo100a300=0
    var sueldoMay300=0
    var totalSueldo=0.0

    while(x<=cantEmpleados){
        print("Ingresa el sueldo del empleado $x $")
        var sueldo= readLine()!!.toDouble()

        if(sueldo>=100 && sueldo<=300){
            sueldo100a300++
        }else if(sueldo>300){
            sueldoMay300++
        }
        totalSueldo+=sueldo
        x++
    }
    println("Empleados con sueldo entre $100 y $300: $sueldo100a300")
    println("Empleados con sueldo mayor a $300: $sueldoMay300")
}