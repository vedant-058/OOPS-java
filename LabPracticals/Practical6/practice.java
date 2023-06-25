import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class practice {
    public static void main(String[] args) throws IOException {
        File f=new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\LabPracticals\\Practical 6\\Hi 3 musketier.txt");
        FileInputStream fis=new FileInputStream(f);
        int s=fis.available();
        char x[]=new char[s];
        for (int i = 0; i < s; i++) {
            x[i]=(char) fis.read();
        }
        String c=x.toString();
        System.out.println((String) c);
        fis.close();


    }
}
