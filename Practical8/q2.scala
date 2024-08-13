object Q2 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1 || !args(0).forall(_.isDigit)) {
      println("Please provide a single integer input.")
      return
    }

    var input = args(0).toInt
    
    val categorizeNumber = (x: Int) => {
      x match
        case x if x % 3 == 0 && x % 5 == 0 => "Multiple of Both Three and Five"
        case x if x % 3 == 0 => "Multiple of Three"
        case x if x % 5 == 0 => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
    }
    println(categorizeNumber(input))
  }
}