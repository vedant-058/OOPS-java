package Question6;

// import java.sql.TimeTA;
import java.util.*;

public class timezone {
    timeTA a;
    timezone(timeTA a){
        this.a=a;
    }
    void timeTAc(timeTA a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Is time +/-: ");
        String p=sc.next();
        char q[]=p.toCharArray();
        if(q[0]=='+'){
            System.out.print("Enter the hours ahead from given time: ");
            int h=sc.nextInt();
            System.out.print("Enter the Minutes ahead from given time: ");
            int m=sc.nextInt();
            System.out.print("Enter the Seconds ahead from given time: ");
            int s=sc.nextInt();
            timeTA c=new timeTA(h, m, s);
            a.add(a, c);
        }
        else if(q[0]=='-'){
            System.out.print("Enter the hours behind from given time: ");
            int h=sc.nextInt();
            System.out.print("Enter the Minutes behind from given time: ");
            int m=sc.nextInt();
            System.out.print("Enter the Seconds behind from given time: ");
            int s=sc.nextInt();
            timeTA c=new timeTA(h, m, s);
            a.sub(a, c);
        }
        sc.close();
    }
}
