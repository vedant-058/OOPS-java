package Question4;
import java.util.*;
public class demo {
    public static void main(String[] args){
        double i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        i=sc.nextDouble();
        j=sc.nextDouble();
        // sc.close();
        arithmetic a=new arithmetic(i, j);
        int flag;
        System.out.println("Enter 1 for add; Enter 2 for Sub: ");
        flag=sc.nextInt();
        sc.close();
        if(flag==1)
            a.add();    
        else
            a.sub();
    }
}
