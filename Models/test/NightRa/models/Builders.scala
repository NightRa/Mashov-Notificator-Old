package NightRa.models

import grades.Grade
import subject._
import NightRa.models.Noops._
import java.util.Calendar

//Created By Ilan Godik
object Builders {
  def Grade(subject: Subject = Subject(), testName: String = noName, date: Calendar = emptyDate, grade: Int = 0): Grade = {
    new Grade(subject, testName, date, grade)
  }

  def Subject(name: String = noName, teacherName: String = noName): Subject = {
    new Subject(name, teacherName)
  }
}
