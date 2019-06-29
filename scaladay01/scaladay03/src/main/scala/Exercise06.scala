object Exercise06 {
  // 程序的入口：
  def main(args: Array[String]): Unit = {
    val oralceDB = new OracleDB with Operate3
    oralceDB.insert(100)

    val mysql = new MySQL3 with Operate3
    mysql.insert(200)

    val l3 = new MySQL3_ with Operate3 {
      override def say(): Unit = {
        println("这么麻烦")
      }
    }
    l3.insert(122)

  }
}

trait Operate3 {
  def insert(id: Int): Unit = {
    println("插入数据为 = " + id)
  }
}

class OracleDB {

}

abstract class MySQL3 {

}

abstract class MySQL3_ {
  def say()

}