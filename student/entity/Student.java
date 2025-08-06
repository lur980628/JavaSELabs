// mylab/student/entity/Student.java
package mylab.student.entity;

import mylab.student.exception.InvalidGradeException;

public class Student {
    private String studentId;
    private String name;
    private String major;
    private int grade;

    public Student(String studentId, String name, String major, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        setGrade(grade);
    }

    // 모든 필드에 대한 getter
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getGrade() {
        return grade;
    }

    // 모든 필드에 대한 setter
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 4) {
            throw new InvalidGradeException("학년은 1~4 사이여야 합니다.");
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s / %s / %d학년", name, major, grade);
    }
}