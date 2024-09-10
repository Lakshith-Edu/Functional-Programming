class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator must be nonzero")
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational): Rational =
    new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def toString: String = s"$numer/$denom"
}

class Account(initialBalance: Double) {
  private var balance: Double = initialBalance

  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    balance -= amount
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    withdraw(amount)
    toAccount.deposit(amount)
  }

  def getBalance: Double = balance
}

object Bank {
  def negativeBalances(accounts: List[Account]): List[Account] =
    accounts.filter(_.getBalance < 0)

  def totalBalance(accounts: List[Account]): Double =
    accounts.map(_.getBalance).sum

  def applyInterest(accounts: List[Account]): List[Account] = {
    accounts.map { account =>
      val balance = account.getBalance
      if (balance > 0) account.deposit(balance * 0.05)
      else if (balance < 0) account.withdraw(balance.abs * 0.1)
      account
    }
  }
}

object LetterCounter {
  def countLetterOccurrences(words: List[String]): Int = {
    words.map(_.length).reduce(_ + _)
  }
}

object Main extends App {
  println("\nRational Number Data Structure: ")
  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)
  println(s"x - y - z = ${x.sub(y).sub(z)}")

  println("\nBank Data Structure: ")
  val accounts = List(
    new Account(100),
    new Account(-50),
    new Account(200),
    new Account(-25)
  )

  println(s"Negative balances: ${Bank.negativeBalances(accounts).length}")
  println(s"Total balance: ${Bank.totalBalance(accounts)}")
  
  val updatedAccounts = Bank.applyInterest(accounts)
  println(s"Total balance after interest: ${Bank.totalBalance(updatedAccounts)}")

  println("\nLetter Counter: ")
  val words = List("apple", "banana", "cherry", "date")
  println(s"Total count of letter occurrences: ${LetterCounter.countLetterOccurrences(words)}")
}
