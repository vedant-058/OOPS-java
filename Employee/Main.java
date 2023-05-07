public class Main {
    public static void main(String[] args) {
        System.out.println("Inputs defined");
        permanent a=new permanent(29442, "Ram", 100);
        a.display();
        HourlyEmployee b=new HourlyEmployee(a,5,1000);
        b.display();
    }
}
