object ForDemo5 {
  def main(args: Array[String]): Unit = {
    //99乘法表
    for (i <- 1 to 9){
      for (j <- 1 to i){
        print(s"$j * $i = ${i * j}\t")
      }
      println()
    }
  }
}
