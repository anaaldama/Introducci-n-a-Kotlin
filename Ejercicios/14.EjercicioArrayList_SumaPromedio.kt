package Ejercicios

fun main(){
    val arrayList = ArrayList<Int>()

    var ciclo=0
    var numero=0
    var suma=0
    var cont=0

    while(ciclo==0){
        println("Ingrese un número entero:")
        numero= readLine()!!.toInt()
        arrayList.add(numero)

        if(numero==0){
            break
        }
        cont++
    }

    for(elementos in 0..cont){
        println("lista[$elementos]="+ arrayList[elementos])
        suma=suma+arrayList[elementos]
        if(elementos==cont){
            val promedio=suma/elementos
            println("La suma de los números es: $suma")
            println("El promedio es: $promedio")
        }
    }
}