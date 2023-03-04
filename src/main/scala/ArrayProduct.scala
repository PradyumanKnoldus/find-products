
class ArrayProduct (numbers : Array[Int]) {

  //Calculate Product of Array Elements
  val product = try {
    numbers.product
  } catch {
    case e: ArithmeticException => BigInt(numbers.product)
  } finally {
    println("Product of Elements of an Array is - ")
  }

  //Prints the product of Array Elements
  def print(): Unit = {
    println(product)
  }
}