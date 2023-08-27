import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
            File f = new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\Files Stream\\Stream Question 3\\src", "file.txt");
            if (f.createNewFile()) {
                System.out.println("File Created!." + f.getName());
            } else {
                System.out.println("File Exists!.");
            }
            BufferedWriter writer=new BufferedWriter(new FileWriter(f));
            writer.write("Hi this is file!\n");
            writer.flush();
            writer.close();
            System.out.println("Written content");
//            Scanner sc=new Scanner(f);
//            while(sc.hasNext()){
//                System.out.printf(sc.next());
//            }
            FileInputStream fis=new FileInputStream(f);
            int s=fis.available();
            String str="";
            for (int i = 0; i < s; i++) {
                int b = fis.read();
                str+=(char) b;
            }
        System.out.println(str);
            char a[] =str.toCharArray();
            for(int i=0;i<a.length;i++){
                if(i%2!=0){
                    System.out.print(a[i]);
                }
                else{
                    System.out.print(" ");
                }
            }
            fis.close();
    }
}
