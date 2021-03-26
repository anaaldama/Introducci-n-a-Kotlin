package Ejercicios

fun main(){
    println("----MENU-------")
    println("1.  Área y perimetro del cuadrado")
    println("2.  Área y perimetro del rectangulo")
    println("3.  Área y perimetro del triangulo")
    println("4.  Área y perimetro del circulo")
    println("5.  Área y perimetro del rombo")
    println("6.  Área y perimetro del trapecio")
    println("7.  Área y perimetro del poligonos")
    println("-----------------")
    print("Ingrese la opción:")
    val op= readLine()!!.toInt()

     when(op){
         1->{
             println("Ingrese el lado:")
             var lado= readLine()!!.toDouble()
             var perimetro=4*lado
             var area=lado*lado
             println("El área del cuadro es $area y el perimetro es $perimetro")
         }
         2->{
             println("Ingrese la base:")
             var base= readLine()!!.toDouble()
             println("Ingrese la altura:")
             var altura= readLine()!!.toDouble()
             var perimetro=(2*altura)+(2*base)
             var area=base*altura
             println("El área del rectángulo es $area y el perimetro es $perimetro")
         }
         3->{
             print("Seleccione una opción: 1=Equilátero, 2=Isósceles, 3=Escaleno")
             val op2= readLine()!!.toInt()
             when(op2){
                 1->{
                     println("Ingrese el lado:")
                     var lado= readLine()!!.toDouble()
                     println("Ingrese la altura:")
                     var altura= readLine()!!.toDouble()

                     var perimetro=lado*3
                     var area=(lado*altura)/2
                     println("El área del triangulo es $area y el perimetro es $perimetro")
                 }
                 2->{
                     println("Ingrese el lado:")
                     var lado= readLine()!!.toDouble()
                     println("Ingrese la base:")
                     var base= readLine()!!.toDouble()
                     println("Ingrese la altura:")
                     var altura= readLine()!!.toDouble()

                     var perimetro=(lado*2)+base
                     var area=(base*altura)/2
                     println("El área del triangulo es $area y el perimetro es $perimetro")
                 }
                 3->{
                     println("Ingrese la base:")
                     var base= readLine()!!.toDouble()
                     println("Ingrese el lado 2:")
                     var lado2= readLine()!!.toDouble()
                     println("Ingrese el lado 3:")
                     var lado3= readLine()!!.toDouble()
                     println("Ingrese la altura:")
                     var altura= readLine()!!.toDouble()

                     var perimetro=base+lado2+lado3
                     var area=(base*altura)/2
                     println("El área del triangulo es $area y el perimetro es $perimetro")

                 }
                 else-> println("opción no valida")
             }
         }
         4->{
             println("Ingrese el diametro:")
             var diametro= readLine()!!.toDouble()
             val PI = 3.1416
             var radio=diametro/2

             var perimetro=PI*diametro
             var area=(PI*(radio*radio))
             println("El área del triangulo es $area y el perimetro es $perimetro")
         }
         5->{
             println("Ingrese el lado:")
             var lado= readLine()!!.toDouble()
             println("Ingrese el diametro mayor:")
             var diametroMayor= readLine()!!.toDouble()
             println("Ingrese el diametro menor:")
             var diametroMenor= readLine()!!.toDouble()

             var perimetro=4*lado
             var area=(diametroMayor*diametroMenor)/2
             println("El área del triangulo es $area y el perimetro es $perimetro")

         }
         6->{
             println("Ingrese el lado base mayor:")
             var ladoBaseMayor= readLine()!!.toDouble()
             println("Ingrese el lado  base menor:")
             var ladoBasemenor= readLine()!!.toDouble()
             println("Ingrese el lado 3:")
             var lado3= readLine()!!.toDouble()
             println("Ingrese el lado 4:")
             var lado4= readLine()!!.toDouble()
             println("Ingrese la altura:")
             var altura= readLine()!!.toDouble()

             var perimetro=ladoBaseMayor+ladoBasemenor+lado3+lado4
             var area=((ladoBaseMayor*ladoBasemenor)*altura)/2
             println("El área del triangulo es $area y el perimetro es $perimetro")
         }
         7->{
             println("Ingrese el número de lado:")
             var numeroLado= readLine()!!.toInt()
             println("Ingrese el valor del lado:")
             var lado= readLine()!!.toDouble()
             println("Ingrese la apotema del polígono:")
             var apotema= readLine()!!.toDouble()

             var perimetro=lado*numeroLado
             var area=(perimetro*apotema)/2
             println("El área del triangulo es $area y el perimetro es $perimetro")
         }
         else -> println("Opción fuera de rango")
     }
}