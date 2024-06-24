
object Q4 {
  def calculateProfit(price: Int): Int = {
    val baseAttendance = 120
    val attendanceIncrease = 20
    val costPerPerformance = 500
    val costPerAttendee = 3

    val attendance = baseAttendance + ((15 - price) / 5) * attendanceIncrease
    val revenue = price * attendance
    val cost = costPerPerformance + (attendance * costPerAttendee)
    val profit = revenue - cost

    profit
  }

  def findBestTicketPrice(): Double = {
    val ticketPrices = Array(5, 10, 15)
    val profits = ticketPrices.map(calculateProfit)
    val maxProfit = profits.max
    val bestTicketPrice = ticketPrices(profits.indexOf(maxProfit))

    bestTicketPrice
  }

  def main(args: Array[String]): Unit = {
    val bestPrice = findBestTicketPrice()
    println(s"The best ticket price: $bestPrice")
  }
}