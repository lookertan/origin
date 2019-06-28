import Utils.getNextNum

object Utils{
  var currentNum = 100000

  def getNextNum()={
    currentNum+=100
    currentNum
  }
}
class Frock(var serialNumber :Int){
  def this(){
    this(getNextNum())
  }

  def getSerailNumber() ={
    serialNumber
  }
}
object Test{
  def main(args: Array[String]): Unit = {

    val fro01 = new Frock()
    val fro02= new Frock()
    val fro03= new Frock()
    println("fro01 的SerialNumber:\t"+fro01.getSerailNumber())
    println("fro02 的SerialNumber:\t"+fro02.getSerailNumber())
    println("fro03 的SerialNumber:\t"+fro03.getSerailNumber())

  }
}