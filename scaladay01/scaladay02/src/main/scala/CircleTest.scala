object CircleTest {
  def main(args: Array[String]): Unit = {
    val c1 = new Cylinder
    println(c1.getLength())
    println(c1.getRadius())
    println(c1.findVolume())
  }

}


class Circle(var radius:Double = 1.0) {


  def setRadius(radius: Double): Unit = {
    this.radius = radius
  }

  def getRadius() = {
    radius
  }

  def findArea() = {
    Math.PI * radius * radius
  }

}


class Cylinder(var length :Double =1) extends Circle(length) {

  def setLength(length: Double): Unit = {
    this.length = length
  }

  def getLength() = {
    this.length
  }

  def findVolume() = {
    findArea() * length
  }


}
