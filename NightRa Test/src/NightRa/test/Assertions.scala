//Created By Ilan Godik
package NightRa.test

import org.junit.{ComparisonFailure, Assert}
import reflect.ClassTag

class Assertions(expected: Any)(implicit val doublePrecision:Double = 0.01) {
  //               Of type:  Able to retrieve:
  def intercept[T <: Throwable : Manifest](f: => Any): T = {
    val expectedName = manifest.runtimeClass.getName
    val actual = try { // The exception
      f //Preform throwing operation
      None //Nothing thrown
    } catch {
      case caught: Throwable => caught // Propagate to actual.
    }

    actual match {
      case None =>
        throw new AssertionError("Exception expected but not thrown. \r\nExpected: <" + expectedName+">\r\n")
      case matching: T => matching
      case _ => throw new ComparisonFailure("Wrong exception was thrown. ", expectedName, actual.getClass.getName)
    }
  }

  implicit def toAssertion(expected: Any) = Assertion(expected)
}
