object Detail04 {
  def main(args: Array[String]): Unit = {

/*
    println(sayOk())
    println(sayOk("tanchuang"))
*/

    mysqlCon(pwd="123456",user="tanchuang",port=1111111)
  }

  def sayOk(name: String = "jack"): String = {

    return name + "ok!"

  }


  def mysqlCon(add: String = "localhost",
               port: Int = 3306,
               user: String = "root",
               pwd: String = "root") = {

    println("add = " + add)
    println("port = " + port)
    println("user = " + user)
    println("pwd = " + pwd)
  }
}
