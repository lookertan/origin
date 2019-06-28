object ForDemo6 {
  def main(args: Array[String]): Unit = {
    var max = for(i <- 1 to 10 ) yield i*i
    println(max)
  }
}
