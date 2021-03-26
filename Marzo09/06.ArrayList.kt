package Marzo09

fun main(){
    val arrayList = ArrayList<String>()
    arrayList.add("Uva")
    arrayList.add("kiwi")
    arrayList.add("Pitaya")
    println("El elemento en la posicion 3 es " + arrayList[2])


    println("Todos los elementos son:")
    for(elementos in arrayList){
        println(elementos)
    }

    println("Todos los elementos por indice son:")
    for(fruta in 0..2){
        println(arrayList[fruta])
    }

    arrayList.set(0, "Melocotón")
    println(arrayList)

    if(arrayList.contains("Pitaya")){
        println("Fruta encontrada")
    }else{
        println("Fruta no encontrada")
    }

    for(desconocido in 0..arrayList.size -1){
      println(arrayList[desconocido])
    }
}