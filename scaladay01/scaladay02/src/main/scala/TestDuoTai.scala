object TestDuoTai {
  def main(args: Array[String]): Unit = {

    val mag1 = new Manager(name1="谭闯",salary_month1 = 3000000,bonus = 99999999)
    val pub1 = new PublicEmp(name1="小黄人",salary_month1 = 200)

    showEmpAnnal(mag1)
    showEmpAnnal(pub1)

  }

  def showEmpAnnal(emp:Employee)={
    println(emp.getAnnual())
  }
}


class Employee(var name: String, var salary_month: Double) {
  def getAnnual() = {
    salary_month * 12
  }
}

class Manager(var bonus: Double, name1: String, salary_month1: Double)
  extends Employee(name1, salary_month1) {

  def manange() = {
    println("管理")
  }
  override def getAnnual():Double={

    salary_month * 12 +1111

  }

}

class PublicEmp(name1: String, salary_month1: Double) extends
  Employee(name1, salary_month1) {
  def work(): Unit = {
    println("工作")
  }

  override def getAnnual(): Double = {


    salary_month * 12 + 300
  }
}



