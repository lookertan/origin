import scala.io.StdIn

object MyIfDemo2 {
  def main(args: Array[String]): Unit = {
    /*
      如果输入小于70分 失败
      在输入男 进入男子组 否则进入女子组
     */
    print("请输入您的成绩： ")
    val speed  = StdIn.readDouble()
    if(speed >= 70){
      val gender = StdIn.readLine("请输入您的性别： ")
      if(gender.equals("男")){
        println("进入男子组")

      }else{
        println("进入女子组")
      }
    }else{
      print("失败")
    }


  }
}
