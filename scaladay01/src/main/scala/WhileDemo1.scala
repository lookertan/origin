object WhileDemo1 {
  def main(args: Array[String]): Unit = {
    /*    var i= 1
        var a = 20
        println(a)
        while(i <=10){
          println(i + "\t 尚硅谷，你好")
          i += 1
        }*/
    /*   println( sum(10,20))
      sum*/

    //  print(afun)
    //    println(fun1(200, 300))
    //    println(fun2(b = 3))
    //    fun2(1,2,3,4)

    //    println(fun2((1 to 100): _*))

//    var result = digui(5)
//    println(result)

    println(sqrt1(110))
  }

  def sqrt1(n :Int)={
    if(n>0){
      Math.sqrt(n)
    }else{
      throw new IllegalArgumentException
    }
  }


  def digui(n: Int): Int = {
    if (n == 1) {
      1
    } else {
      n * digui(n - 1)
    }
  }

  def fun2(arr: Int*) = {
    var sum = 0;
    for (i <- arr) {
      sum += i;
    }
    sum
  }


  def fun1(a: Int, b: Int, c: Int = 200) = {
    a + b + c
  }

  def fun2(a: Int = 1, b: Int, c: Int = 3) = {
    a + b + c
  }


  def sum(a: Int, b: Int) = {
    a + b
  }

  def sum = {
    println("sum1")
  }

  /*  val afun ={
  //    println("11111")
      122011
    }*/
}

/*
   scala 训练

 */
