//Created By Ilan Godik
package NightRa.test

import org.junit.Assert

case class Assertion(expected:Any)(implicit val doublePrecision:Double = 0.01){
  def ===(actual: Any) {
    (expected, actual) match {
      case (e: Double, a: Double) => Assert.assertEquals(e, a, doublePrecision)
      case (e: Array[Double], a: Array[Double]) => Assert.assertArrayEquals(e, a, doublePrecision)
      case (e: Array[AnyRef], a: Array[AnyRef]) => Assert.assertArrayEquals(e, a)
      case (e: Any, a: Any) => Assert.assertEquals(e, a)
    }
  }
}