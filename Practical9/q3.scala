object p9q3 {
  def toUpper(name: String): String = {
    name.toUpperCase
  }

  def toLower(name: String): String = {
    name.toLowerCase
  }

  def formatNames(name: String)(format: String => String): String = {
    format(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("BENNY", "NIroshan", "saman", "KumarA")
    names.foreach { name =>
      val upperCaseName = formatNames(name)(toUpper)
      val lowerCaseName = formatNames(name)(toLower)
      println(s"Original Name: $name")
      println(s"Name in Upper Case: $upperCaseName")
      println(s"Name in Lower Case: $lowerCaseName")
    }
  }
}