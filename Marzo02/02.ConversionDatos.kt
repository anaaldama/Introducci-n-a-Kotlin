package Marzo02

fun main(){
    var num1 : Int = 5
    var num2 : Int = 10
    var strgnumero : String = "19"

    num1 = strgnumero.toInt()
    println ("string a Int $num1")

    var num3:Float?
    num3=num2.toFloat()
    println("Int a Float $num3")

    var num4:Double?
    num4=num3.toDouble()
    strgnumero=num4.toString()
    println("Float a Double $num4")
    println("Double a String $strgnumero")
}