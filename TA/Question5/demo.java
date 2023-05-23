package Question5;
import java.util.*;
public class demo {
    public static void main(String[] args) {
        System.out.println("Enter Number in the format:\nSTATE_CODE'-'DISTRICT_CODE CHARACTERS_CODE'-'SEQUENCE_NUMBER");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        Registration_Number a=new Registration_Number(s);
        a.check();
    }
}
