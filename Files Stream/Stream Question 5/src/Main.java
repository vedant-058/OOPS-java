import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File f=new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\Files Stream\\Stream Question 5\\src","pdt.txt");
        String str= Files.readAllLines()
//        FileInputStream fis=new FileInputStream(f);
//        int s=fis.available();
//        String item="";
//        int price;
//        int quantity;
//        for (int i = 0; i < s; i++) {
//            int b=fis.read();
//            if(){
//
//            }
//        }
        BufferedReader br=new BufferedReader(new FileReader(f));
    }
}