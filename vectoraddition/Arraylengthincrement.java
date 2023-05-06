package vectoraddition;
import java.util.*;

public class Arraylengthincrement {
    public static void main(String[] args){
        int s=5;
        Scanner sc=new Scanner(System.in);
        // s=sc.nextInt();
        
        int x=0,w=0;
        System.out.println("If 5 elements are okay then press 0 else 1");
        w=sc.nextInt();
        if(w==0){
            s=5;
        }
        else{
            while(x!=999){
                System.out.println("If want to increase array length by 1 give input !=999");
                x=sc.nextInt();
                if(x==999){
                    break;
                }
                else{
                    s++;
                    System.out.println("Array length become "+s);
                }
            }
            
        }
        int a[]= new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<s;i++){
            System.out.println(a[i]);
        }
    }
}
