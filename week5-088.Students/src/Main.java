import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        while (true) {
            String name;
            String studentNumber;
            System.out.println("name: ");
            name = reader.nextLine();
            if (name.equals("")) {
                break;
            }

            System.out.println("studentnumber: ");
            studentNumber = reader.nextLine();
            students.add(new Student(name, studentNumber));
        }
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        for (Student student : students) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
