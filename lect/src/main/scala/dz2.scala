import scala.math.round
import scala.math.floor

object chetn extends App {
 var kvm = (y: Double) => {
  if ((y / 2) == floor(y / 2)) println(round(y) + " четное число ")
  else println(round(y) + " нечетное число ")
 }
 kvm(1)
 kvm(10)
 kvm(-3)
}

object PlusMinusZero extends App {
 var PMZ = (y: Int) => {
  if (y >0 ) println(y + " положительное число ")
  else if (y== 0) println(" это ноль ")
       else println(y + " отрицательное число ")
 }
 PMZ(1)
 PMZ(0)
 PMZ(-3)
}

object Cycle extends App {
 var Cycle1 = (i: Int) => {
  for (y <- 1 to i) println(y)
 }
 var Cycle2 = (i: Int) => {
  for (y <- 1 until i) println(y)
 }
 Cycle1(10)
 Cycle2(10)
}

object Table5 extends App {
 var Table = (i: Int) => {
  for (y <- 1 to i) println(y*5)
 }
 Table(10)
}

object Fibo extends App {
 var Fib = (i: Int) => {
  var i1=0
  var i2=1
  var i3: Int=0
  println(i1)
  println(i2)
  for (y <- 3 to i) {
   i3=i1+i2
   println(i3)
  i1=i2
  i2=i3}
 }
 Fib(10)
}