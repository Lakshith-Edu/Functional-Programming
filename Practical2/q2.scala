object Q2 {
  def main(args: Array[String]) = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f

    var g: Float = 3.2f // was not given
    
    b -= 1
    println(b * a + c * d)
    d -= 1
    println(a)
    a += 1
    println(-2 * (g - k) + c)
    c = c + 1
    // println(c = c++)
    // println(c = ++c * a++)
  }
}