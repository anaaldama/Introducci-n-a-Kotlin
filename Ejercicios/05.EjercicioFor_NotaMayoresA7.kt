package Ejercicios

fun main(){
    var mayoresA7=0;
    var menoresA7=0;

    for(i: Int in 1..10){
        println("Ingresa la calificacion $i:");
        val calif:Int = readLine()!!.toInt();
        if(calif>=7){
            mayoresA7++
        }else{
            menoresA7++;
        }
    }
    println("Las calificaciones mayores a 7 son $mayoresA7");
    println("Las calificaciones mayores a 7 son $menoresA7");
}