//Created By Ilan Godik
package NightRa.models

import java.util.{Calendar, GregorianCalendar}

package object grades {
  val noName = "No name"
  val emptyDate = new GregorianCalendar()

  def Grade(subject: Subject = Subject(), testName: String = noName, date: Calendar = emptyDate, grade: Int = 0): Grade = {
    new Grade(subject, testName, date, grade)
  }

  def Subject(name: String = noName, teacherName: String = noName): Subject = {
    new Subject(name, teacherName)
  }



//  val citizenship = Subject(name = "Citizenship", teacherName = "Golan")
//  val history = Subject(name = "History", teacherName = "Eli")
//
//  val test1 = Grade(citizenship, "מבחן מחצית ב מס' 2 - הגבלת השלטון", new GregorianCalendar(2013,3+1,12),93)
//  val test2 = Grade(history,"מקור לאומיות",new GregorianCalendar(2013,2+1,5),100)
}