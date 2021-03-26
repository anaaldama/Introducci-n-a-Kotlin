package Marzo12
class Person(nombre: String, edad: Int, altura: Double, peso: Double, color_ojos: String, genero: String) {
    var nombre: String? = null
    var edad: Int? = null
    var altura: Double? = null
    var peso: Double? = null
    var color_ojos: String? = null
    var genero: String? = null

    init{
        this.nombre = nombre
        this.edad = edad
        this.altura = altura
        this.peso = peso
        this.color_ojos = color_ojos
        this.genero = genero
    }
    fun GetNombre(): String? {
        return this.nombre
    }
    fun GetGenero(): String? {
        return this.genero
    }
    /*
    constructor(nombre: String, edad: Int, altura: Double, peso: Double, color_ojos: String, genero: String) {
        this.nombre = nombre
        this.edad = edad
        this.altura = altura
        this.peso = peso
        this.color_ojos = color_ojos
        this.genero = genero
    }*/
}
fun main() {
    var persona1 = Person("Ana", 38, 1.56, 80.0, "negros",  "femenino")
    println("El nombre es: " + persona1.GetNombre() + " y su genero es " + persona1.GetGenero())
    var persona2 = Person("Paula", 28, 1.55, 58.7, "cafés", "femenino")
    println("El nombre es: " + persona2.GetNombre() + " y su genero es " + persona2.GetGenero())
}