import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class student implements Comparable<student> {
    int r,s;
    String n,c;
    long ct;
    ArrayList<student> arr=new ArrayList<>();
    student(int r,int s,String n,String c,long ct){
        this.r=r;
        this.s=s;
        this.n=n;
        this.c=c;
        this.ct=ct;
    }
    void add(student st){
        arr.add(st);
    }
    void remove(student st){
        arr.remove(st);
    }
    void print(student p){
        System.out.println("Roll: "+r+"\nSemester: "+s+"\nName: "+n+"\nCity: "+c+"\nContact: "+ct);
    }
    void display(){
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            student p=(student)itr.next();
            print(p);
        }
    }

    public static void main(String[] args) {
        student s=new student(3,5,"Hello","Nagpur",92939492);
        s.add(s);
        System.out.println("Added Object.");
        s.display();
//        s.remove(s);
//        System.out.println("Removed");
//        s.display();
    }
}
