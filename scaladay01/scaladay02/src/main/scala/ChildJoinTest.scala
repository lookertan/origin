object ChildJoinTest {
  def main(args: Array[String]): Unit = {

    val child01 = new Child("猪猪女")
    val child02 = new Child("绿茶妹")
    val child03 = new Child("万士城")
    val child04 = new Child("章泽天")
    val child05 = new Child("黑泽志玲")


    Child.palyjoin(child01)
    Child.palyjoin(child02)
    Child.palyjoin(child03)
    Child.palyjoin(child04)
    Child.palyjoin(child05)

    Child.getCount()

  }
}

class Child(var name: String) {

}


object Child {
  var count = 0

  def palyjoin(child: Child): Unit = {
    printf("%s 加入游戏\n", child.name)
    count += 1
  }

  def getCount() = {
    printf("现在有%d个小孩参加游戏", count)
  }

}

