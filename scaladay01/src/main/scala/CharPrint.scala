object CharPrint {
  def main(args: Array[String]): Unit = {
    var name :String = "banzhang"

    var age:Int = 18

    println(name + " " + age)

    printf("name = %s,age = %d\n",name,age)

    println(s"name = $name,age = $age")

  }
}
