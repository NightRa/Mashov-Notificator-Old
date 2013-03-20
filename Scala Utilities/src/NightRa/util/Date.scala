//Created By Ilan Godik
package NightRa.util

import java.util.GregorianCalendar

case class Date(day:Int, month:Int, year:Int) extends GregorianCalendar(year,month+1,day){
  def this() = this(1,0,0)
}





