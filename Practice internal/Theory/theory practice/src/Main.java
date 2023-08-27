import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            File f=new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\Practice internal\\Theory\\theory practice\\src","f.txt");
            object a=new object(5,7);
            if(!f.exists()){
                f.createNewFile();
            }
//            BufferedWriter writer=new BufferedWriter(new FileWriter(f));
//            FileOutputStream fos = new FileOutputStream(f);
//            ObjectOutputStream oos=new ObjectOutputStream(fos);
//            oos.writeObject(a);
//            oos.close();
//            fos.close();
//            FileInputStream fis=new FileInputStream(f);
//            ObjectInputStream ois=new ObjectInputStream(fis);
//            object b=(object)ois.readObject();
//            b.display();
//            ois.close();
//            fis.close();
//            Scanner sc=new Scanner(f);
//            while(sc.hasNext()){
//                System.out.print(sc.next()+" ");
//            }
//            sc.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}