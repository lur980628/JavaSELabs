// mylab/student/exception/InvalidGradeException.java
package mylab.student.exception;

// Exception 클래스나 그 하위 클래스를 상속받도록 수정합니다.
// 여기서는 IllegalArgumentException을 상속받는 것이 적절합니다.
public class InvalidGradeException extends IllegalArgumentException {
    public InvalidGradeException(String message) {
        super(message);
    }
}