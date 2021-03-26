package Ejercicios
//calcular su salario semanal
//Salario minimo 2021 141.7 pesos
fun main(){
    println("Ingrese las horas laboradas en la semana:")
    val horas= readLine()!!.toInt()
    val salario:Double?

        if(horas>40){
            salario=40*141.7 //salario 40 hrs
            val horasExtras=horas-40 //Horas extras
            val salarioExtra=((horasExtras*141.7)*2)+salario
            println("Salario con ($horasExtras) horas extras: $salarioExtra")
        }else{
            salario=horas*141.7
            println("Salario minimo: $salario")
        }

}