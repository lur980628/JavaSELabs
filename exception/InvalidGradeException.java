// mylab/student/exception/InvalidGradeException.java
package mylab.student.exception;

// Exception Ŭ������ �� ���� Ŭ������ ��ӹ޵��� �����մϴ�.
// ���⼭�� IllegalArgumentException�� ��ӹ޴� ���� �����մϴ�.
public class InvalidGradeException extends IllegalArgumentException {
    public InvalidGradeException(String message) {
        super(message);
    }
}