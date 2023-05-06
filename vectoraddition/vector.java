package vectoraddition;
import java.util.*;
public class vector{
    int a[],b[],c[];
    int s;
    vector(int s){
        this.s=s;
        a=new int[s];
        b=new int[s];
        c=new int[s];
    }
    void display(){
        System.out.println("Added Array:");

        for(int i=0;i<s;i++){
            System.out.println(c[i]);
        }
    }
    void addition(){
        for(int i=0;i<s;i++){
            c[i]=a[i]+b[i];
        }
        display();
    }
    
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Array 1:");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array 2:");
        for(int i=0;i<s;i++){
            b[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Input completed:) Control passed to Addition");
        addition();
    }
}
