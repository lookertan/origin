object Exercise02 {
  def main(args: Array[String]): Unit = {
    val card1 = new Pork("♠")
    println(card1.toString())
    println(isRed(card1))
    val card2 = new Pork("♣")
    println(card2.toString())
    println(isRed(card2))

    val card3 = new Pork("♦")
    println(card3.toString())
    println(isRed(card3))

    val card4 = new Pork("♥")
    println(card4.toString())
    println(isRed(card4))



  }
  def isRed(card: Pork) = {
    if (card.color.equals("♠") || card.color.equals("♣")) {
      false
    } else if (card.color.equals("♦") || card.color.equals("♥")) {
      true
    }
  }
}

/*
2. 编写一个扑克牌只能有 4 种花色,让其 toString 方法分别返回♣,♦,♥,♠，并实现一个函数,检查某张牌的花色是否为红色
 */
class Pork(var color: String) {

  override def toString() = {
    color
  }
}

