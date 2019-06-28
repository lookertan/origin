object Exrercise05 {
  def main(args: Array[String]): Unit = {
    val rectangle = new Rectangle(20, 39)
    val point = rectangle.centerPoint()
    println("中心点 x轴坐标 为: " + point.x + " y轴坐标为： " + point.y)
    println("面积为： " + rectangle.findArea())

  }
}

class Point(val x: Double, val y: Double)

abstract class Shape {
  def centerPoint(): Point

  def findArea(): Double
}

class Rectangle(val x: Double, val y: Double) extends Shape {
  override def centerPoint(): Point = {
    new Point(this.x / 2, this.y / 2)
  }

  override def findArea(): Double = x * y
}

class Circle(val radius: Double) extends Shape {
  override def centerPoint(): Point = {
    new Point(this.radius, this.radius)
  }

  override def findArea(): Double = {
    math.Pi * radius * radius
  }
}