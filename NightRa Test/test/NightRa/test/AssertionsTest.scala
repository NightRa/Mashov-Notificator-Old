//Created By Ilan Godik
package NightRa.test

import org.junit.{ComparisonFailure, Test}

class AssertionsTest extends Assertions {
  @Test
  def testDouble() {
    val d1 = 3.5
    val d2 = 3.49
    d1 === d2
  }

  @Test
  def testDoubleArray() {
    val arr1 = Array(3.5, 2.8, 32, 6.77)
    val arr2 = Array(3.5, 2.8, 32, 6.771)
    arr1 === arr2
  }

  @Test
  def testDoublePrecisionImplicitPropagation() {
    val assertions = new Assertions(0.0001)
    val assertion = assertions.toAssertion(0.01)
    assertion.expected === 0.01
    assertion.doublePrecision === 0.0001
  }

  @Test
  def testAssertionDoublePrecision() {
    val assertion = Assertion(0.01)(0.0001)
    assertion.===(0.0099)
  }

  @Test
  def testAssertionDoublePrecisionFail() {
    intercept[AssertionError]{
      Assertion(0.09,0.001) === 0.08
    }
  }

  @Test
  def testExpectedValue() {
    Assertion(5).expected === 5
  }

  @Test
  def testInt() {
    val i1 = 3
    val i2 = 3
    i1 === i2
  }

  @Test
  def testArray() {
    val arr1 = Array("Hello!", "How are you?")
    val arr2 = Array("Hello!", "How are you?")
    arr1 === arr2
  }

  @Test
  def testObject() {
    class Test(val i: Int) {
      override def equals(obj: Any) = obj.isInstanceOf[Test] && obj.asInstanceOf[Test].i == i
    }
    val test1 = new Test(10)
    val test2 = new Test(10)
    test1 === test2
  }

  @Test
  def testCaseClass() {
    case class Test(i: String)
    val test1 = Test("Hello!")
    val test2 = Test("Hello!")
    test1 === test2
  }

  @Test
  def testNotEqualsExceptionExact() {
    intercept[AssertionError] {
      1 === 2
    }
  }

  @Test
  def testNotEqualsException() {
    intercept[AssertionError] {
      1 === 2
    }
  }

  @Test
  def testInterceptNoException() {
    intercept[AssertionError]{
      intercept[Throwable]{
        1 + 2
      }
    }
  }

  @Test
  def testWrongExceptionThrown() {
    val exception = intercept[ComparisonFailure]{ // val = thrown exception from inside::
      intercept[IllegalArgumentException]{ //Throws ComparisonFailure. Expects IllegalArgumentException
        1 === 2 // Actual is AssertionError.
      }
    }
    "org.junit.ComparisonFailure" === exception.getClass.getName
    "java.lang.IllegalArgumentException" === exception.getExpected
    "java.lang.AssertionError" === exception.getActual
  }

  @Test
  def testExceptionPropagation() {
    val exception = intercept[IllegalArgumentException]{
      throw new IllegalArgumentException("I am an exception!")
    }
    "I am an exception!" === exception.getMessage
  }
}
