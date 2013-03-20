//Created By Ilan Godik
package NightRa.util

import org.junit.Test
import NightRa.test.Assertions

class DateTest extends Assertions {
  @Test
  def testDateEquals() {
    val date = new Date(19, 3, 2013)
    val date1 = new Date(19, 03, 2013)

    date === date1
  }

  @Test
  def testEmptyConstructor() {
    val date = new Date
    val expected = new Date(1, 0, 0)
    expected === date
  }

  @Test
  def testToString() {
    val date = new Date(19, 3, 2013)
    val s = "19/03/2013"

    s === date.toString
  }
}
