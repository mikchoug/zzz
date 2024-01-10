import scala.math.sqrt

object kvadrat extends App {

  val kv = (y: Int) => y*y
  var x: Int = 1
  println(x + " в квадрате будет " + kv(x))
  x = 2
  println(x + " в квадрате будет " + kv(x))
  x = 3
  println(x + " в квадрате будет " + kv(x))
}


object plowad extends App {
  val S = (y: Int) => 3.14 * y * y
  val r: Int = 2
  println("площадь круга с радиусом " + r + " = " + S(r))
}

object rastoanie extends App {
  val Rast = (x1: Int, y1: Int, x2: Int, y2: Int) => sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
  val x1: Int=5
  val x2: Int=7
  val y1: Int=5
  val y2: Int=8
  println("расстояние между точками " + " = " + Rast(x1, y1, x2, y2))
}
object perevodCF extends App {
  val Gradus = (t: Float) => 9 * t / 5 + 32
  val t: Int = 8
  println(t + " градусов =" + Gradus(t) + " фаренгейт")
}

object dlina extends App {
  val D = (l: String) => l.length
  val Str: String = "hello"
  println(" длина строки " +Str + " = "+ D(Str))
}