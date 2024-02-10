import java.io.Serializable;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment (Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Course getCourse() {
        return course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "Student: " + student.getName() + " enrolled in " + course.getCourseName() + " on " + enrollmentDate;
    }

}
