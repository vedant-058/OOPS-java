import java.util.*;
class Student implements Comparable<Student> {
    Integer roll_no, sem;
    String name, city;
    String ph_no;
    public int compareTo(Student ob) {
        int cmp = sem.compareTo(ob.sem);
        if (cmp == 0) {
            cmp = roll_no.compareTo(ob.roll_no);
        }
        return cmp;
    }
    Student(Integer r, Integer s, String n, String c, String p) {
        roll_no = r;
        sem = s;
        name = n;
        city = c;
        ph_no = p;
    }
}
class MissingDetailsException extends Exception {
    public MissingDetailsException(String message) {
        super(message);
    }
}

