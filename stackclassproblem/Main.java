package stackclassproblem;
public class Main{
    public static void main(String[] args) {
        Stack s=new Stack(5);
        System.out.println("Vedant Tiwari 68 JAVA");
        System.out.println("ADDED ELEMENTS");

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Called display");
        s.display();
        System.out.println("Pop Called 2 times");
        s.pop();
        s.pop();
        System.out.println("Display called");

        s.display();
        System.out.println("Peek called");
        s.peek();
        System.out.println("Display called");
        s.display();
    }
}