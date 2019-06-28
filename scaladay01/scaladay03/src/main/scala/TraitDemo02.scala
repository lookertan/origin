

object TraitDemo02 {
  def main(args: Array[String]): Unit = {
/*
    val c = new C
    c.getConnect
*/

  val a = new A11111()
    a.getConnect()
  }

/*  def getConnection()={
    println("测试")
  }*/

}

trait Trait01{
  def getConnect()
}

class A11111 extends Trait01{
  override def getConnect(): Unit = {
    println("测试")
  }
}


