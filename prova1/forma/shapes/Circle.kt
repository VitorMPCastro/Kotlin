package prova1.forma.shapes

import prova1.forma.Shape

class Circle(private var radius: Double) : Shape() {

    override fun getPerimeter() : Double {
        return 2 * Math.PI * this.radius
    }

    override fun getArea() : Double {
        return Math.PI * (this.radius * this.radius)
    }

}