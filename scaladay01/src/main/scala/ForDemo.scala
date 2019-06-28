object ForDemo {
  def main(args: Array[String]): Unit = {

    // 打印100次 尚硅谷你好
    var i = 1 to 10
    print(i)

    for(i <- 1 to 100){
      println(i + "\t尚硅谷，你好！！！")
    }

    for(i <- 101 until 201 ){
      println(i + "\t尚硅谷，你不好！！！")
    }

  }
}
