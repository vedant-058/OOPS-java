package Practical2;
public class Main {
    public static void main(String[] args){
        
        // time a=new time(2,3,4);
        // time b=new time(4,4,4);
        // a.add(a, b);
        // a.sub(a, b);
        // attendence x = new attendence(a, b);
        // x.attended(a, b);
        // System.out.println("Enter the number of days for which you want to keep the record of: ");
        employee e1=new employee("Jay", 9, 30, "HR", 135000);
        e1.print();
        employee e2=new employee("Shree", 81, 29, "HR", 145000);
        e2.print();
    }
}
