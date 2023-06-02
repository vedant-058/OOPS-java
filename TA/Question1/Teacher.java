import java.time.LocalDate;
import java.time.Period;
public class Teacher extends Person {
 double salary;
 String qualifications;
 int experience;
 public Teacher(String name, String dob, String qualifications, int
experience) {
    super(name, dob);
    this.qualifications = qualifications;
    this.experience = experience;
 }
 public double calculateSalary() {
    double baseSalary = 0;
    if (qualifications.equals("PG")) baseSalary = 60000;
    else if (qualifications.equals("PHD")) baseSalary = 80000;
    salary = baseSalary + (experience * 2000L);
    return salary;
 }
 public int calculateAge() {
    LocalDate dateOfBirth = LocalDate.parse(dob);
    LocalDate currentDate = LocalDate.now();
    return Period.between(dateOfBirth, currentDate).getYears();
 }
}