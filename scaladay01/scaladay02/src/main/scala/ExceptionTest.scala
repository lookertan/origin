object ExceptionTest {
  def main(args: Array[String]): Unit = {
/*    try {
      println(1 / 0)
    } catch {
      case ex : ArithmeticException => {
        println("你个大傻逼 不能除0 啊")
      }
      case ex : Exception =>{
        println("你他妈的能不能聪明点")
      }
    }finally {
      println("老子来帮你擦屁股了")
    }

    println("我在finnaly 外面")*/
  try {
    test1()
  } catch {
    case ex:ArithmeticException =>{
      println("我来 把她接住")
    }
  }
  }


  def test1()={
    throw new ArithmeticException("草 我要扔异常")
  }
}
