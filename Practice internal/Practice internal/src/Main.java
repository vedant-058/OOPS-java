import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("E:\\RCOEM 4TH Semester\\Java VSC (Errors)\\Practice internal\\Practice internal","practice.txt");
            if(!f.exists()){
                f.createNewFile();
            }
//            FileOutputStream writer=new FileOutputStream(f);
//            ObjectOutputStream oos=new ObjectOutputStream(writer);
//            practice p=new practice("This is the practice object!",192);
//            oos.writeObject(p);
//            oos.close();
//            writer.close();

            FileInputStream inp=new FileInputStream("practice.txt");
            ObjectInputStream ois=new ObjectInputStream(inp);
            practice demo=(practice)ois.readObject();
            demo.display();
            ois.close();
            inp.close();
        }
        catch (Exception e){
            System.out.println("\n\nException is: "+e);
        }
    }
}
class practice implements Serializable{
    String s;int t;
    practice(String s,int y){
        this.s=s;
        t=y;
    }
    void display(){
        System.out.println(s+" "+t);
    }
}