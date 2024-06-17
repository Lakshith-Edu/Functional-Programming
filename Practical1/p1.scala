object Practical1 {
  val diskArea = (x: Double) => Math.PI * x * x
  val Fahrenheit = (x: Double) => x * 1.8 + 32
  val volumeSphere = (x: Double) => 4.0/3.0 * Math.PI * x * x * x
  val cost = (x: Double) => 24.95 * x * 0.6 + 3 + 0.75 * (x - 50)
  val runTime = () => 2 * 8 + 3 * 7 + 2 * 8

  def main(args: Array[String]) = {
    println(diskArea(5))
    println(Fahrenheit(35))
    println(volumeSphere(5))
    println(cost(60))
    println(runTime())
  }
}