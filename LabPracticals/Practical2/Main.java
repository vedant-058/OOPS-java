package Practical2;
public class Main {
    public static void main(String[] args){
        time a=new time(2,3,4);                         
        time b=new time(4,4,4);
        System.out.println("Addition of time: ");
        a.add(a, b);
        System.out.println("Subtraction of time: ");
        a.sub(a, b);
        attendence x = new attendence(a, b);
        System.out.println("Attended time is : ");
        x.attended(a, b);
        System.out.println("Employee : ");
        employee e1=new employee("Jay", 9, 30, "HR", 135000);
        System.out.println("The final working time of jay is: ");
        e1.print();
        employee e2=new employee("Prathmesh", 81, 29, "HR", 145000);
        System.out.println("The final working time of Prathmesh is: ");
        e2.print();
    }
}
