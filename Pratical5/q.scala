import scala.io.StdIn.readLine
object Q1 {
  
  def getProductList: List[String] = {
    var productList: List[String] = List.empty
    var input = ""
    
    while (input != "done") {
      input = readLine("Enter a product name (or 'done' to finish): ")
      if (input != "done") {
        productList = productList :+ input
      }
    }
    
    productList
  }

  def printProductList(productList: List[String]): Unit = {
    productList.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    productList.length
  }

  def main(args: Array[String]) = {
    var lst = getProductList
    printProductList(lst)
    println(s"Total products: ${getTotalProducts(lst)}")
  }
}