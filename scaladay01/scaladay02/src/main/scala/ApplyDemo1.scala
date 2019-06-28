object ApplyDemo1 {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 5)

    println(list)

    val pig = new Pig("小花猪")
    val pig01 = Pig("小红猪")
    val pig02 = Pig()


    println(pig.name)
    println(pig01.name)
    println(pig02.name)


  }
}


class Pig(var name: String) {

}

object Pig {
  def apply(name: String = "小黄人"): Pig = new Pig(name)

  def apply(): Pig = new Pig("大黄人")

}