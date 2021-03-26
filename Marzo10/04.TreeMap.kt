package Marzo10
import java.util.*

    fun main() {
        val treemap = TreeMap<String, Int>()
        treemap["Abisaí"] = 32
        treemap["Cecilia"] = 28
        /*for ((nombre, edad) in treemap){
            println("$nombre : $edad")
        }*/
        println("------HASHMAP------")
        val hashMap = HashMap<Int, String>()
        hashMap.put(1, "Casillas")
        hashMap.put(15, "Ramos")
        hashMap.put(3, "Pique")
        hashMap.put(5, "Puyol")
        hashMap.put(11, "Capdevila")
        hashMap.put(14, "Xabi Alonso")
        hashMap.put(16, "Busquets")
        hashMap.put(8, "Xavi Hernandez")
        hashMap.put(18, "Pedrito")
        hashMap.put(6, "Iniesta")
        hashMap.put(7, "Villa")
        var it = hashMap.keys.iterator()
        while (it.hasNext()) {
            val key: Int = it.next()
            println("Clave: " + key + " -> Valor: " + hashMap[key])
        }
        println("------TREEMAP------")
        val treeMap = TreeMap<Int, String>()
        treeMap.put(1, "Casillas")
        treeMap.put(15, "Ramos")
        treeMap.put(3, "Pique")
        treeMap.put(5, "Puyol")
        treeMap.put(11, "Capdevila")
        treeMap.put(14, "Xabi Alonso")
        treeMap.put(16, "Busquets")
        treeMap.put(8, "Xavi Hernandez")
        treeMap.put(18, "Pedrito")
        treeMap.put(6, "Iniesta")
        treeMap.put(7, "Villa")

        it = treeMap.keys.iterator()
        while (it.hasNext()) {
            val key = it.next()
            println("Clave: " + key + " -> Valor: " + treeMap[key])
        }
        println("------------------")
        for ((clave, valor) in treeMap.entries){
            println("$clave -> $valor")
        }
        println("Mostramos el numero de elementos que tiene el TreeMap: ${treeMap.size}")
        println("Vemos si el TreeMap esta vacio: ${treeMap.isEmpty()}")
        println("Obtenemos un elemento del Map pasandole la clave 6: ${treeMap.get(6)}")
        println("Borramos un elemento del Map el 18 (porque fue sustituido): ${treeMap.remove(18)}")
        println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: ${treeMap.get(18)}")
        println("Vemos si existe un elemento con la clave 18: ${treeMap.containsKey(18)}")
        println("Vemos si existe un elemento con la clave 1: ${treeMap.containsKey(1)}")
        println("Vemos si existe el valor 'Villa' en el Map: ${treeMap.containsValue("Villa")}")
        println("Vemos si existe el valor 'Ricardo' en el Map: ${treeMap.containsValue("Ricardo")}")
        println("Borramos todos los elementos del Map.")
        treeMap.clear()
        println("Comprobamos si lo hemos eliminado viendo su tamaño: ${treeMap.size}")
        println("Lo comprobamos tambien viendo si esta vacio: ${treeMap.isEmpty()}")
    }
