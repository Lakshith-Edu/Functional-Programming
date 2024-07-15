object Q3 {
  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def main(args: Array[String]): Unit = {
    val n = 10
    for (i <- 0 until n) {
      print(s"${fibonacci(i)} ")
    }
  }
}