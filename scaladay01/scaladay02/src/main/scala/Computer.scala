object Computer1 {
  def main(args: Array[String]): Unit = {

    val a :PC = new PC
    a.cpu="泰坦星人"
    a.memory = "128G"
    a.df = "800T"
    a.brand = "美国良心"
    println(a.getDetails() + "\t" + a.brand)

    val b = new NotePad
    b.cpu="AMD 锐龙THreadripper"
    b.memory = "128G"
    b.df = "800T+200TSSD"
    b.color="黄色"
    println(b.getDetails() + "\t" + b.color)

  }



}

class Computer{
  var cpu: String = _
  var memory: String = _
  var df: String = _
  def getDetails()={
    s"电脑属性===>> CPU：$cpu\t内存：$memory\t磁盘大小：$df"
  }

}


class PC extends Computer{

  var brand :String = _



}

class NotePad extends Computer{
  var color:String = _

}



