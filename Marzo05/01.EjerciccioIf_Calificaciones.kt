package Marzo05

fun main (){
    println("Ingresa el nombre del alumno:")
    val nomAlumno=readLine()
    println("Ingresar la calificación del parcial 1:");
    val calPar1 =readLine()!!.toDouble()
    println("Ingresar la calificación del parcial 2:");
    val calPar2=readLine()!!.toDouble()
    println("Ingresar la calificación del parcial 3:");
    val calPar3 =readLine()!!.toDouble()

    val  promedio: Double =(calPar1+calPar2+calPar3)/3

    //EXENTO
    if(promedio >= 9.5){
        println("El alumno $nomAlumno esta exento, porque su promedio es $promedio");
    }
    //ORDINARIO
    if(promedio >= 6.0 && promedio < 9.5){
        println("El alumno $nomAlumno está en ordinario, porque su promedio es $promedio");

        println("Calificación del ordinario:");
        val calOrd=readLine()!!.toDouble()
        val ordinario = (promedio + calOrd)/2

        if(ordinario>=6){
            println("El alumno $nomAlumno está libre de ordinario, su promedio es $ordinario")
        }else{
            println("El alumno $nomAlumno está en extraordinario, su promedio es $ordinario")

            println("Calificación del extraordinario:")
            val calExtra= readLine()!!.toDouble()

            if(calExtra >= 6){
                println("El alumno $nomAlumno está libre del extraordinario, su calificacion es $calExtra")
            }else{
                println("El alumno $nomAlumno está reprobado y ha perdido sus oportunidades, dado que su promedio es: $calExtra")
            }
        }
    }
    //EXTRAORDINARIO
    if(promedio<6){
        println("El alumno $nomAlumno está en extraordinario, su calificación es $promedio")

        println("Calificacion  del extraordinario:")
        val calExtra= readLine()!!.toDouble()

        if(promedio>=6){
            println("El alumno $nomAlumno está en extraordinario, su calificacion es $calExtra")
        }else{
            println("El alumno $nomAlumno está en reprobado y ha perdido sus oportunidades, su calificacion es $calExtra")
        }
    }

}
