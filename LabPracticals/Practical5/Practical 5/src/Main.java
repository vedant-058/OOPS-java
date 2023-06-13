import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        File f1 = new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\LabPracticals\\Practical5\\Practical 5\\src\\input.txt");
        Scanner sc = new Scanner(f1);
        String name = sc.nextLine();
        double cppa = Double.parseDouble(sc.nextLine());
        String rollno = sc.nextLine();
        String pass = sc.nextLine();
        student s1=new student(name,cppa,rollno,pass);
        s1.allchecks();
    }
}