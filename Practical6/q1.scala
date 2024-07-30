object Q1 {

  case class Product(id: Int, name: String, quantity: Int, price: Double)

  def main(args: Array[String]): Unit = {
    val inventory1: Map[Int, Product] = Map(
      101 -> Product(101, "ProductA", 10, 15.0),
      102 -> Product(102, "ProductB", 5, 25.0),
      103 -> Product(103, "ProductC", 20, 10.0)
    )

    val inventory2: Map[Int, Product] = Map(
      102 -> Product(102, "ProductB", 10, 20.0),
      104 -> Product(104, "ProductD", 15, 30.0)
    )

    val productNames = inventory1.values.map(p => p.name).toList
    println(s"Product Names: $productNames")

    val totalValue = inventory1.values.map(p => p.quantity * p.price).sum
    println(s"Total Value: ${totalValue}")

    val isEmpty = inventory1.isEmpty
    println(s"Is Inventory1 Empty: $isEmpty")

    val mergedInventory = (inventory1.toSeq ++ inventory2.toSeq)
      .groupBy(_._1)
      .map { case (id, products) =>
        val mergedProduct = products.map(_._2).reduce { (p1, p2) =>
          Product(p1.id, p1.name, p1.quantity + p2.quantity, math.max(p1.price, p2.price))
        }
        id -> mergedProduct
      }
    println(s"Merged Inventory: $mergedInventory")

    val productIdToCheck = 102
    inventory1.get(productIdToCheck) match {
      case Some(product) => println(s"Product with ID $productIdToCheck: $product")
      case None => println(s"Product with ID $productIdToCheck does not exist in inventory1")
    }
  }
}