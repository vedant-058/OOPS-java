import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            File f=new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\Files Stream\\Stream Ques 2\\src","file1.txt");
            if(!f.exists()){
                System.out.println("File not exists. New created");
                f.createNewFile();
            }
//            else{
                System.out.println("File1 Exists. File opened");
                FileOutputStream fos=new FileOutputStream(f,false);
                int x[]={100,200,300,400};
                for (int i = 0; i < x.length; i++) {
                    fos.write(x[i]);
                }
                fos.close();
            File f2=new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\Files Stream\\Stream Ques 2\\src","file2.txt");
            if(!f2.exists()){
                System.out.println("Not Exists. file created");
                f2.createNewFile();
            }
//            else{
            System.out.println("File2 Exists. File opened");
                FileInputStream fis=new FileInputStream(f);
                FileOutputStream fos2=new FileOutputStream(f2);
                int b=fis.available();
            int y=0;
                for (int i = 0; i < b; i++) {
                    y=fis.read();
                    System.out.println(y);
                    fos2.write(y);
                }
                fis.close();
                fos2.close();
//            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}