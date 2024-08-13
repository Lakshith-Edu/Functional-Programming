object Q1 {

  def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello"
    val shift = 3

    val encrypt = (text: String, shift: Int) => {
      text.map { c =>
        if (c.isLetter) {
          val base = if (c.isUpper) 'A' else 'a'
          ((c - base + shift) % 26 + base).toChar
        } else {
          throw new IllegalArgumentException("Only letters are allowed") 
        }
      }
    }

    val decrypt = (text: String, shift: Int) => {
      text.map { c =>
        if (c.isLetter) {
          val base = if (c.isUpper) 'A' else 'a'
          ((c - base - shift + 26) % 26 + base).toChar
        } else {
          throw new IllegalArgumentException("Only letters are allowed") 
        }
      }
    }

    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted text: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted text: $decryptedText")
  }
}