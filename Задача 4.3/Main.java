import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        imputData(students);
        printAllStudents(students);
    }

    private static void printAllStudents(Set<Student> students) {

        System.out.println("Список студентов");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void imputData(Set<Student> students) {
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
                final String userInput = scan.nextLine();
                if ("end".equals(userInput)) break;
                final Student student = parseContact(userInput);
                if (students.contains(student.getStudentId()) == students.add(student)) {
                    System.out.println("С таким номером студенческого билета:" + " " + student.getStudentId() + " " + "в базе студент существует");
                } else {
                    students.add(student);
                }
            }

        }

    }


    private static Student parseContact(String userInput) {
        final String[] studentData = userInput.split(",\\s+");
        return new Student(studentData[0], studentData[1], studentData[2]);
    }
}




