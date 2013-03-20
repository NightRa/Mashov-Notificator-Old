//Created By Ilan Godik
package NightRa.util

import org.junit.Test
import NightRa.test.Assertions
import NightRa.util.RichInt.int2RichInt

class RichIntTest extends Assertions {
  @Test
  def testWith0Prefix1() {
    "05" === 5.with0Prefix(2)
  }

  @Test
  def testWith0Prefix2() {
    "00019" === 19.with0Prefix(5)
  }
}
