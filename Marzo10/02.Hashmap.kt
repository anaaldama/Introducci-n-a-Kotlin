package Marzo10

fun main(){
    val hashmap = HashMap<Int,String>()
    hashmap.put(1,"Ciudad victoria");
    hashmap.put(2,"San Fernando");
    hashmap.put(0,"Reynosa")
    hashmap.put(50,"Matamoros")
    println(hashmap[0])

    println("--Impresión completa ---")
    for(clave:Int in hashmap.keys){
        println(hashmap[clave])
    }

    hashmap.put(50,"Nuevo Laredo")
    hashmap.put(45,"Tampico")
    println("----Impresión completa ---")
    for(clave:Int in hashmap.keys){
        println(hashmap[clave])
    }
    //----------------------------------------
    val usuarioCiudad = HashMap<String, String>()
    println("¿El hashMap esta vacío?: " +
            usuarioCiudad.isEmpty())
    usuarioCiudad.put("Juan", "Nueva York")
    usuarioCiudad.put("Memphis", "Holanda")
    usuarioCiudad.put("Lionel", "Argentina")
    println("usuarioCiudad HashMap : $usuarioCiudad")

    //Tamaño de hashMap
    println("Tenemos la información de la ciudad de " +
            usuarioCiudad.size + " usuarios")
    val usuarioNombre = "Juan"

    //checa si existe en el hashMap
    if (usuarioCiudad.containsKey(usuarioNombre)) {//Obtiene el valor asignado a una clave dada en hashMap
        val ciudad = usuarioCiudad[usuarioNombre]
        println("$usuarioNombre vive en $ciudad")
    } else {
        println("Los detalles de la ciudad no se encuentran para el usuario $usuarioNombre")
    }

    //Checa si exste en el hashMap
    if (usuarioCiudad.containsValue("Nueva York")) {
        println("Hay una persona en usuarioCiudad que vive en Nueva York")
    } else {
        println("No hay una persona en usuarioCiudad que viva en Nueva York")
    }

    //Modifica el valor asignado a una clave existente
    usuarioCiudad[usuarioNombre] = "California"
    println(usuarioNombre + " se movió a la ciudad de " + usuarioCiudad[usuarioNombre] + ", nuevo usuarioCiudad : " + usuarioCiudad)
}
