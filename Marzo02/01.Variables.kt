package Marzo02

import java.math.RoundingMode
import java.text.DecimalFormat

fun main(){
    var nombre="Ana"
    var edad=38
    var ciudad="Veracruz"
    println("Mi nombre es: "+nombre+ ", tego "+edad+" años y vivo en "+ciudad)
    println("Mi nombre es $nombre, tengo $edad años y vivo en $ciudad")

    var x=2
    x=8
    //Comentario
    val y =10
    //y=3

    var doble = 41.259856516548949816129
    var flotante = 41.259856516548949816129f
    println(doble)//muestra solo 14 digitos despues del punto
    println(flotante)//muestra solo 6 digitos despues del punto

    //Opcion 1 para mostrar solo 2 decimales
    println("%.2f".format(doble))//Utilizando el metodo .format()

    //Opcion 2 para mostrar solo 2 decimales
    val df = DecimalFormat("#.##")//Alt+Enter para mostrar Agrega libreria de java
    df.roundingMode=RoundingMode.CEILING
    println(df.format(doble))

    val nombre2 ="Ana Paula "
    val apellido="Aldama "+"Uribe"
    println(nombre2+apellido)

    val ciudad2:Char='V' //Un solo caracter utilizar comillas simples
    println("La tercera letra de la variable nombre 2 es ${nombre2[2]}")
    println("La tercera letra de la variable nombre 2 es " + nombre2[2])//Opcion2
}