import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student1 = new Student(1, "John", 20);
        Student student2 = new Student(2, "Jane", 21);
        Student student3 = new Student(3, "Jim", 22);

        Course course1 = new Course("CS101", "Intro to Computer Science", "Dr. Smith");
        Course course2 = new Course("CS102", "Data Structures", "Dr. Johnson");
        Course course3 = new Course("CS103", "Algorithms", "Dr. Brown");

        Enrollment enrollment1 = new Enrollment(student1, course1, "01/01/2024");
        Enrollment enrollment2 = new Enrollment(student2, course2, "01/02/2024");
        Enrollment enrollment3 = new Enrollment(student3, course3, "01/03/2024");

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Module 3/Ex_3_4_3/src/enrollments.ser"));
        output.writeObject(enrollment1);
        output.writeObject(enrollment2);
        output.writeObject(enrollment3);
        output.close();
        System.out.println("Serialized and saved to enrollments.ser");

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("Module 3/Ex_3_4_3/src/enrollments.ser"));
        Enrollment enrollment4 = (Enrollment) input.readObject();
        Enrollment enrollment5 = (Enrollment) input.readObject();
        Enrollment enrollment6 = (Enrollment) input.readObject();

        input.close();
        System.out.println("Deserialized information:");
        System.out.println(enrollment4);
        System.out.println(enrollment5);
        System.out.println(enrollment6);

        }
    }
