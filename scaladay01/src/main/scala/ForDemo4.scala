import scala.util.control.Breaks

object ForDemo4 {
  def main(args: Array[String]): Unit = {
/*
    for(i <- 1 to 10 if i %2 ==0){
      println(i)
    }

    var b = false
    for (i <- 1 to 10 if !b){
      print(i + "\n")
      if (i == 6) b = true

    }
*/

  Breaks.breakable(
    for( i  <- 1 to 10 ){

      if(i >=5){
        Breaks.break()
      }else{
        println(i)
      }
    }
  )


  }
}
