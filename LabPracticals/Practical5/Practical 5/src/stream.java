import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class stream {
//    File F = new File("")
public static void main(String[] args) {
    try{
//        using file as input
        File f1 = new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\LabPracticals\\Practical5\\Practical 5\\src\\input.txt");
        FileInputStream fi = new FileInputStream("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\LabPracticals\\Practical5\\Practical 5\\src\\input.txt");
        int fn;
        Scanner sc = new Scanner(f1);
//        System.out.println((char)fn);
        while((fn=fi.read())!=-1){
            System.out.println((char) fn);
        }
        fi.close();
    }
    catch(Exception e){
        System.out.println("File not found error");
    }

}



}
