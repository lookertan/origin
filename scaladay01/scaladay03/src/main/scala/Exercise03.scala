object Exercise03 {
  def main(args: Array[String]): Unit = {
    val account = new CheckingAccount(1000)
    account.deposit(100)
    account.getBalance()
    account.withdraw(100)
    account.getBalance()
  }
}

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }

  def getBalance()={
    println("现在余额： " + balance)
  }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance){

  override def deposit(amount:Double):Double={
    super.deposit(amount-1)
  }

  override def withdraw(amount: Double): Double = super.withdraw(amount +1 )

}