package Ejercicios

class Persona {
    var nombre: String = ""
    var edad: Int = 0

    fun inicializar() {
        print("Ingrese el nombre del alumno: ")
        nombre = readLine()!!
        print("Ingrese la edad: ")
        edad = readLine()!!.toInt()
    }

    fun contenido() {
        println("El alumno: $nombre tiene $edad")
    }
    fun mayorEdad () {
        if (edad >= 18)
            println("$nombre  es mayor de edad")
        else
            println("$nombre es menor de edad")
    }
}