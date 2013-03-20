//Created By Ilan Godik
package NightRa.models.subject

import org.junit.Test
import NightRa.test.Assertions
import NightRa.models.Builders._

class SubjectTest extends Assertions{
  val subject = new Subject("Citizenship","Golan")

  @Test
  def testPartialConstructorTeacher() {
    val subj = Subject(teacherName = "Eli")
    assert("Eli" == subj.teacherName)
  }

  @Test
  def testPartialConstructorName() {
    val sub = Subject("History")
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
