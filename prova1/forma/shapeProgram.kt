package prova1.forma

import prova1.forma.shapes.Circle

fun shapeProgram(){
    val unitCircle = Circle(1.0)

    println("Area: " + unitCircle.getArea())
    println("Perimetro: " + unitCircle.getPerimeter())
}