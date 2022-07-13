import java.util.Objects;

public class Student {
    private String fio;
    private String group;
    private String studentId;

    public Student(String fio, String group, String studentId) {
        this.fio = fio;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || !obj.getClass().equals(Student.class))
            return false;
        Student altStudent = (Student) obj;
        return studentId.equals(altStudent.studentId);
    }


    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return String.format("%s группа %s (%s)", fio, group, studentId);
    }


    public String getFio() {
        return fio;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }
}
