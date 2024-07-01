object Q1 {
  def reverseString(str: String): String = {
    if str.isEmpty then "" else reverseString(str.tail) + str.head
  }

  def filterStrings(list: List[String]): List[String] = {
    if list.isEmpty then List() else (
      if list.head.length > 5 then list.head :: filterStrings(list.tail) else 
        filterStrings(list.tail)
    )
  }

  def calculateAverage(num1: Int, num2: Int): Double = {
    (BigDecimal(num1 + num2)/2).setScale(2).toDouble
  }

  def sumEvenNumbers(numbers: List[Int]): Int = {
    if numbers.isEmpty then 0 else ( if numbers.head % 2 == 0 then numbers.head else 0) + sumEvenNumbers(numbers.tail)
  }

  def main(args: Array[String]) = {
    println(reverseString("Hello World!"))
    
    println(filterStrings(List("Hellooo", "World", "Scalaaaa", "Java", "Python", "C+++++++")))

    println(calculateAverage(10, 27))

    println(sumEvenNumbers(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
  }
}