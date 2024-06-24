object Q3 {
    def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
      val normalRate = 250
      val otRate = 85
      val taxRate = 0.12

      val normalPay = normalHours * normalRate
      val otPay = otHours * otRate
      val grossPay = normalPay + otPay
      val taxAmount = grossPay * taxRate
      val takeHomeSalary = grossPay - taxAmount

      return takeHomeSalary
    }

    def main(args: Array[String]): Unit = {
      val normalHours = 30

      val otHours = 40

      val takeHomeSalary = calculateTakeHomeSalary(normalHours, otHours)
      println(s"take home salary is: Rs. $takeHomeSalary")
    }
  }