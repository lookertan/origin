import java.io.{BufferedInputStream, FileInputStream}

object DownLoad {

  def main(args: Array[String]): Unit = {

    /*
      var s :Short = 5
    //     s= s -2  error  Short-> Int
        var b :Byte = 3
    //     b = b+ 4  //error Int -> Byte

        var c : Char  ='a'
        var i :Int  =5;
        var d :Float = .314F
        var result:Double  =c +i +d
        //Ok float ->double

        var a :Byte  =5
        var s :Short = 3
        var t : Short  = a + s
        // 自动类型转换和JAVA 规则一样
        // byte -> short ->int -> long ->float ->double
        //        chart -> int -> long ->float ->double
    */

    /*    var b1: Byte = 5
        var s1: Short = 3
        //    var t :Short = s+b//error
        var t2 = s1 + b1 //ok 类型推导

        println(t2)*/
    /*    for (i <- 1 to 10){
          print(func(i) + "\t")

        }
        println()
        println("-----------------------------")

        for (i <- 1 to 10){

          println(func2(i))
        }*/

    //    println(func3(1))

    //    println(func4())

    //    mysqlConf()

    println(sum(1, 2, 3, 4, 5, 6, 7, 12))

  }

  def func(n: Int): Int = {

    if (n == 2 || n == 1) {
      1
    } else {
      func(n - 1) + func(n - 2)
    }
  }

  def func2(n: Int): Int = {
    if (n == 1) {
      3
    } else {
      2 * (func2(n - 1)) + 1
    }
  }

  def func3(n: Int): Int = {

    if (n == 10) {
      1
    } else {
      (func3(n + 1) + 1) * 2
    }
  }


  def func4(n: Int = 1): Int = {
    if (n == 10) {
      1
    } else {
      (func4(n + 1) + 1) * 2
    }
  }

  def mysqlConf(host: String = "localhost", port: Int = 3306, user: String = "root"
                , pwd: String = "root") = {
    println("host = " + host)
    println("port = " + port)
    println("user = " + user)
    println("pwd  = " + pwd)
  }

  def sum(n1: Int, ns: Int*) = {
    var sum = n1
    for (n <- ns) {
      sum += n
    }
    sum
  }


}


