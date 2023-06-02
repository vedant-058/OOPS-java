import java.time.LocalDate;
import java.time.Period;
public class Student extends Person{
    int rollNo;
    int semester;
    double CGPA;
    public Student(String name, String dob, int rollNo, int semester,
   double CGPA) {
        super(name, dob);
        this.rollNo = rollNo;
        this.semester = semester;
        this.CGPA = CGPA;
    }
    public int calculateAge(){
        LocalDate dateOfBirth = LocalDate.parse(dob);
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth,currentDate).getYears();
    }
   }