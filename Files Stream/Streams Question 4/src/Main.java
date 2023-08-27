import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File f=new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\Files Stream\\Streams Question 4\\src","file.txt");
        if(f.createNewFile()){
            System.out.println("File created: file.txt");
        }
        else {
            System.out.println("File Exists!.");
        }
        String str;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string: ");
        str=sc.nextLine();
        String ans=str.toUpperCase();
        System.out.println(ans);
        BufferedWriter writer=new BufferedWriter(new FileWriter(f));
        writer.write(str);
        writer.close();

        File f2=new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\Files Stream\\Streams Question 4\\src","file2.txt");
        if(f2.createNewFile()){
            System.out.println("File created: file2.txt");
        }
        else {
            System.out.println("File Exists!.");
        }
        BufferedWriter wrt2=new BufferedWriter(new FileWriter(f2));
        wrt2.write(ans);
        wrt2.close();
    }
}