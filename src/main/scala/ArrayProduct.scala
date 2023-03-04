
class ArrayProduct (numbers : Array[Int]) {

  //Calculate Product of Array Elements
  val product = if (numbers.exists(_ < 0)) {
    throw new IllegalArgumentException("Array contains negative numbers")
  } else {
    try {
      numbers.product
    } catch {
      case e: ArithmeticException => BigInt(numbers.product)
    } finally {
      println("Product of Elements of an Array is - ")
    }
  }

  //Prints the product of Array Elements
  def print(): Unit = {
    println(product)
  }
}