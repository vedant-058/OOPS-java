package Bankclassproblem;
public class Main {
    public static void main(String[] args) {
        bank x=new bank(123,500,"B");
        bank y=new bank(188,100,"A");
        // System.out.println("A details");
        x.display();
        // System.out.println("A me deposit");
        x.deposit(1000);
        // System.out.println("A me withdrawal");
        x.withdrawal(500);
        System.out.println("****After transfer****");
        x.transfer(x, 1500, y);
        // System.out.println("A ki details");
        x.display();
        // System.out.println("B ki details");
        y.display();
    }
}
