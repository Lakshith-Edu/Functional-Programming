import scala.io.StdIn.readLine

object Q2 {
  case class Book(title: String, author: String, isbn: String)

  var library: Set[Book] = Set(
    Book("Book1", "Author1", "ISBN1"),
    Book("Book2", "Author2", "ISBN2"),
    Book("Book3", "Author3", "ISBN3")
  )

  def addBook(title: String, author: String, isbn: String): Unit = {
    val newBook = Book(title, author, isbn)
    library += newBook
  }

  def removeBook(isbn: String): Unit = {
    library = library.filterNot(_.isbn == isbn)
  }

  def checkBookExists(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }

  def searchBookByTitle(title: String): Option[Book] = {
    library.find(_.title == title)
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author == author)
    booksByAuthor.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }

  def main(args: Array[String]) = {
    addBook("Book4", "Author4", "ISBN4")
    removeBook("ISBN3")
    println(checkBookExists("ISBN2"))
    displayLibrary()
    println(searchBookByTitle("Book1"))
    displayBooksByAuthor("Author2")
  }
}