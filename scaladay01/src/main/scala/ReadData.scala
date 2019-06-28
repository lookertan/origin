import scala.io.StdIn

object ReadData {
  def main(args: Array[String]): Unit = {

    var name  =StdIn.readLine("请输入您的姓名")
    var password =StdIn.readLine("请输入您的密码")

    if(name.equals("root") && password.equals("88888888")){
      println("登陆成功")
    }else{
      print("输入有误")
    }


  }
}
