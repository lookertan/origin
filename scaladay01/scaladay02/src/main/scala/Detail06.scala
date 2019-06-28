object Detail06 {
  def main(args: Array[String]): Unit = {
/*
    val cat1 = new Cat
    println(cat1.name)
    println(cat1.color)
    println(cat1.age)
    printf("猫的名字为： %s, 颜色： %s, 年龄：%d\n", cat1.name, cat1.color, cat1.age)

    val dog1 = new Dog

    dog1.name = "尹恩"
    dog1.age = 3
    dog1.color="黄色"

    printf("狗的名字为： %s ,年龄为： %d, 颜色为： %s",dog1.name,dog1.age,dog1.color)
  */
    val cat1:Cat = new LihuaCat
    val cat2:LihuaCat = cat1.asInstanceOf[LihuaCat]
    val cat3 = new LihuaCat

    println(cat1.name)
    println(cat2.name)
    println(cat3.name)
    val a = new AA{}

    println(a)



  }
}

class Cat{

  val name = "xiaobai"
  var age = 3
  var color = "baise"



}

class LihuaCat extends Cat{
  override val name = "lihuamao "
}


abstract class AA




class Dog{
  var name=""
  var age :Int=_
  var color :String=_

}


