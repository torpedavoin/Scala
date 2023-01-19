object calculator
{
  def main(args: Array[String]): Unit={
    var ch:Char=0
    var num1:Int=0
    var num2:Int=0
    var result:Int=0

    print("Виберіть операцію (+ - * / % ) : ")
    ch=scala.io.StdIn.readChar()

    print("Введіть перше число : ")
    num1=scala.io.StdIn.readInt()

    print("Введіть друге число : ")
    num2 = scala.io.StdIn.readInt()
    ch match {
      case '+' => result = num1+num2
      case '-' => result = num1-num2
      case '*' => result = num1*num2
      case '/' => result = num1/num2
      case '%' => result = num1%num2
      case _ => printf("Помилка. \n")
    }
    println("Результат: "+ result);
  }
}
