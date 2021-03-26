package Marzo12

class Alumno {
    var nombre: String = ""
    var calificacion: Int = 0
    fun inicializar() {
        print("Ingrese el nombre del alumno: ")
        nombre = readLine()!!
        print("Ingrese su calificación: ")
        calificacion = readLine()!!.toInt()
    }

    fun imprimir() {
        println("El alumno: $nombre tiene una calificación de $calificacion")
    }
    fun mostrarEstado () {
        if (calificacion >= 6)
            println("$nombre se encuentra aprobado")
        else
            println("$nombre se encuentra reprobado")
    }
}