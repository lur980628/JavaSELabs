// mylab/student/control/StudentTest.java
package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("20240001", "김민수", "컴퓨터공학", 3);
        System.out.println(student1);

        System.out.println("5학년으로 변경");
        try {
            student1.setGrade(5);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }
    }
}