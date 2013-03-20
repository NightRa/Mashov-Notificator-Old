//Created By Ilan Godik
package NightRa.util

import java.util.GregorianCalendar
import NightRa.util.RichInt.int2RichInt

case class Date(day:Int, month:Int, year:Int) extends GregorianCalendar(year,month+1,day){
  def this() = this(1,0,0)

  override def toString: String = day.with0Prefix(2)+"/"+month.with0Prefix(2)+"/"+year
}





