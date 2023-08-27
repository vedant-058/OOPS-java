import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
// Create some Student objects
        TreeSet<Student> students = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            try {
                System.out.println("Enter Name:");
                String n = sc.next();
                if (n.isEmpty()) {
                    throw new MissingDetailsException("Name is missing");
                }
                System.out.println("Enter City:");
                String c = sc.next();
                if (c.isEmpty()) {
                    throw new MissingDetailsException("City is missing");
                }
                System.out.println("Enter Phone Number:");
                String p = sc.next();
                if (p.isEmpty()) {
                    throw new MissingDetailsException("Phone Number is missing");
                }
                System.out.println("Enter Roll No:");
                Integer r = sc.nextInt();
                System.out.println("Enter Semester:");
                Integer sem = sc.nextInt();
                students.add(new Student(r, sem, n, c, p));
                System.out.println("Element added successfully\n\n");
                i++;
            } catch (MissingDetailsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Displaying students");
        display(students);
        System.out.println("\nDisplaying students city-wise");
        displayCityWise(students);
    }
    public static void display(TreeSet<Student> students) {
        System.out.println("Rollno\tName\t\tCity\t\tSemester\tPhone No");
        for (Student student : students) {
            System.out.printf("%-6d\t%-15s\t%-15s\t%-8d\t%s%n",
                    student.roll_no, student.name, student.city, student.sem,
                    student.ph_no);
        }
    }
    public static void displayCityWise(TreeSet<Student> students) {
        TreeSet<String> cities = new TreeSet<>();
        for (Student student : students) {
            cities.add(student.city);
        }
        for (String city : cities) {
            System.out.println("City: " + city);
            for (Student student : students) {
                if (student.city.equals(city)) {
                    System.out.printf("%-6d\t%-15s\t%-8d\t%s%n",
                            student.roll_no, student.name, student.sem, student.ph_no);
                }
            }
            System.out.println();
        }
    }
}