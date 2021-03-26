package Marzo12

class persona(nombre: String, edad: Int, altura: Double, peso: Double, color_ojos: String, genero: String){
    var nombre: String? = null
    var edad: Int? = null
    var altura: Double? = null
    var peso: Double? = null
    var color_ojos: String? = null
    var genero:String?=null
    init {
        //println("nombre: $nombre")
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
}
fun main(){
    var persona1=persona("Ana",38,1.56,80.00,"Negros","Femenino")
    println("El nombre es: ${persona1.GetNombre()}")

    persona1.nombre="Paula"
    println("El nombre es: ${persona1.nombre}")

}