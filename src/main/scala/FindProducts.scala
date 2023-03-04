import scala.io.StdIn.readInt

object FindProducts {
  def main(args: Array[String]): Unit = {

    println("Enter No. of Elements you want to enter : ")
    val arraySize = readInt()

    val numbers = Array.ofDim[Int](arraySize)

    println("Enter Positive Numbers you want to get the product of : ")
    for (index <- 0 until arraySize) {
      numbers(index) = readInt()
    }

    val arrayObject = new ArrayProduct(numbers)

    arrayObject.print()
  }
}