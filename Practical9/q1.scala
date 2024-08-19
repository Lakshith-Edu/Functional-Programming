object p9q1 {

  val calculateInterest: Double => Double = deposit => {
    deposit match {
      case d if d <= 20000 => d * 0.02
      case d if d <= 200000 => d * 0.04
      case d if d <= 2000000 => d * 0.035
      case d => d * 0.065
    }
  }

  def main(args: Array[String]): Unit = {
    val deposits = List(10000, 150000, 2500000, 3000000)
    deposits.foreach { deposit =>
      val interest = calculateInterest(deposit)
      println(s"Deposit: $deposit, Interest: $interest")
    }
  }
}