//Created By Ilan Godik
package NightRa.util

case class RichInt(num:Int) {
  def with0Prefix(length:Int):String = {
    val initialLength = num.toString.length
    if(initialLength>=length) num.toString
    else "0" * (length-initialLength) + num.toString
  }


}

object RichInt{
  implicit def int2RichInt(num:Int) = RichInt(num)
}
