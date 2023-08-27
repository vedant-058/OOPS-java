import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        gen<Integer,Character> a=new gen<>(3,'f');
//        gen<Character,String> b=new gen<>('G',"FA");
//        gen<String,Double> s=new gen<>("Hi Generic Class",5.2);
//        a.display();
//        b.display();
//        s.display();
        threads b1=new threads(6);
        Thread a1=new Thread(b1);
        a1.start();
        threads c=new threads(4);
        Thread y=new Thread(c);
        y.start();
    }
}
class threads implements Runnable{
    int p;
    threads(int q){
        p=q;
    }
    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
        while(true)
            System.out.println("thread: "+p);
//        }
    }
}
