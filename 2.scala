package First

object demo {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    val g = 5.0f

    println(s"a)  --b * a + c * d -- = ${evaluateA()}")
    println(s"b)  a++ = ${evaluateB()}")
    println(s"c)  -2 *(g-k) +c = ${evaluateC()}")
    println(s"d)  c = c++ = ${evaluateD()}")
    println(s"e)  c = ++c * a++ = ${evaluateE()}")

    // Function to evaluate --b * a + c * d --
    def evaluateA(): Int = {
      b -= 1
      val resultA = b * a + c * d
      d -= 1
      resultA
    }

    // Function to evaluate a++
    def evaluateB(): Int = {
      val resultB = a
      a+=1
      resultB
    }

    // Function to evaluate -2 * (g - k) + c
    def evaluateC(): Float = {
      val resultC = -2 *(g-k) +c
      resultC
    }

    // Function to evaluate c = c++
    def evaluateD(): Int ={
      val temp = c
      c+=1
      temp
    }

    // Function to evaluate c = ++c * a++
    def evaluateE(): Int ={
      c+=1
      val resultE = c * a
      a+=1
      resultE
    }
  }
}