public class Manager extends director implements ConsultantManager, permanentManager {
    Manager() {}
    public void details(String name) {
        System.out.println("Name of Manager : " + name);
    }
    public void salaryIncr(double salary) {
        salary += 0.5 * salary;
        System.out.println("Your incremented salary is " + salary);
    }
    public void totalExp(int years) {
        System.out.println("Experience : " + years);
    }
}
