object Detail05 {


  def main(args: Array[String]): Unit = {


    /*
        try {
          f11()
        } catch {
          case ex: NumberFormatException => {
            println("老狗，你是不是又扔异常了")
          }
        }
    */
//    triganle()
    jiujiu()
  }

def jiujiu(n:Int = 9)={
  for(i <- 1 to n ;j<-1 to i){
    print(s"$j X $i = ${i * j}\t")

    if(j == i && j!=9){
      println()
    }
  }
}
  @throws(classOf[NumberFormatException])
  def f11(): Unit = {
    "abc".toInt
  }

  def triganle(n: Int = 10): Unit = {
    for (i <- 0 to n - 1 reverse; j = n - i) {
      printKongge(i)
      printXing(2 * j - 1)
      if (i != 0) {
        println()
      }

    }

  }

  def printKongge(n: Int) = {
    var i = n
    while (i > 0) {
      print(" ")
      i -= 1
    }
  }

  def printXing(n: Int) = {
    var i = n
    while (i > 0) {
      print("*")
      i -= 1
    }
  }

}
