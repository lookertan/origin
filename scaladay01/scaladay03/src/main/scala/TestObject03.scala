object TestObject03 {
  def main(args: Array[String]): Unit = {
      val b = new B
    b.getConnect()
  }
}


class A
class B extends A with Trait01{
  override def getConnect(): Unit = {
    println("A <-B")
  }
}
class C extends A

class D
class E extends D
class F extends D

trait Trait01{ def getConnect()}

trait Trait02{ def getConnection()}

trait Trait03{ def getClint()}

