public class App {
    public static void main(String[] args) {
        director d1 = new director();
        d1.details("Ram");

        Manager m1 = new Manager();
        m1.details("Lakhan");
        m1.salaryIncr(200000);
        m1.totalExp(5);

        employee e1 = new employee();
        e1.details("Bharat");
        e1.clientDealt(50);
        e1.clientTillNow(200);
    }
}
