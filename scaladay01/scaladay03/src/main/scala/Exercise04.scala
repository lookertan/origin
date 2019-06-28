object Exercise04 {
  def main(args: Array[String]): Unit = {
    val point = new LabeledPoint("Black Thursday", 1929, 230.07)
    println(point.x)
    println(point.y)
    println(point.label)
  }
}


class Point(val x :Double,val y:Double)
class LabeledPoint(val label:String,x:Double,y:Double)extends Point(x,y)
