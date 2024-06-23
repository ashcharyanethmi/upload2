package First

object demo {
  def main(args: Array[String]): Unit = {
    var i, j, k = 2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    val c = 'X'

    //k + 12 * m
    val resultA = k + 12 * m
    println(s"a) k + 12 * m = $resultA")

    // m/j
    val resultB = m/j
    println(s"b) m/j = $resultB")

    // n%j
    val resultC = n%j
    println(s"c) n%j = $resultC")

    // m/j*j
    val resultD = m/j*j
    println(s"d) m/j*j = $resultD")

    // f + 10 * 5 + g
    val resultE = f + 10 * 5 + g
    println(s"e) f + 10 * 5 + g = $resultE")

    // ++i * n
    i+=1
    val resultF = i*n
    println(s"f) ++i * n = $resultF")

  }
}