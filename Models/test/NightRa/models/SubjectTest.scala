//Created By Ilan Godik
package NightRa.models

import org.junit.Test
import NightRa.test.Assertions

class SubjectTest extends Assertions{
  val subject = new Subject("Citizenship","Golan")

  @Test
  def testPartialConstructorTeacher() {
    val subj = grades.Subject(teacherName = "Eli")
    assert("Eli" == subj.teacherName)
  }

  @Test
  def testPartialConstructorName() {
    val sub = grades.Subject("History")
    "History" === sub.name
  }

  @Test
  def testSubjectName() {
    "Citizenship" === subject.name
  }

  @Test
  def testTeacherName() {
    "Golan" === subject.teacherName
  }
}
