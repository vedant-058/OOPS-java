public class Main {
    public static void main(String[] args) {
//        threads t1=new threads();
//        threads t2=new threads();
//        t1.start();
//        t2.start();
        String s="zb";
        String t="dd";
        System.out.println((char)(100+(s.charAt(0)-t.charAt(0))));
    }
}
class threads extends Thread{
    public void run(){
        System.out.println("ig");
    }
}