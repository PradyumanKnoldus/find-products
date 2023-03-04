
import org.scalatest.matchers.must.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class TestCase1 extends AnyFlatSpec with Matchers {

  "The product of an array of positive integers" should "be computed correctly" in {
    val numbers = Array(2, 3, 5, 7, 11)
    val expectedProduct = 2 * 3 * 5 * 7 * 11
    val actualProduct = numbers.product
    actualProduct should be (expectedProduct)
  }
}

