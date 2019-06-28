object ForDemo2 {
  def main(args: Array[String]): Unit = {
/*    for(i <- (1 to 10).reverse){
      print(i + "\t")
    }*/

    for(i <- 10 to (1,-1)){
      println(i)
    }
  println("---------------------------------------")
    for(i <- 0 to (10,2)){
      println(i)
    }

  }
}
