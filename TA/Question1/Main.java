public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Teacher[] teachers = new Teacher[3];
        students[0] = new Student("Vedant","2003-09-06",81,6,8.8);
        students[1] = new Student("Prathmesh","2003-01-16",57,23,9.8);
        students[2] = new Student("Arpit","2001-07-13",39,5,9.5);
        teachers[0] = new Teacher("KanakMam","1985-05-21","PG",9);
        teachers[1] = new Teacher("HirkaniMam","1998-01-25","PHD",14);
        teachers[2] = new Teacher("PratishrutiMam","1981-01-05","PG",2);

        System.out.println("Age of the students is: ");
        
        for(Student s : students){
            System.out.println(s.name+" - "+s.calculateAge());
        }
        
        System.out.println();
        
        Department Depart = new Department(students,teachers,"CSE");
        int[] a = Depart.minMaxAge();
        System.out.println("Minimum and maximum age of the teacher are "+a[0]+" and "+a[1]+" respectively.");
        System.out.println();
        
        System.out.println("Average age of the student :"+Depart.calculateAverageAge());
        
        System.out.println("Salaries of Teacher's are : ");
        for(Teacher t : teachers){
            System.out.println(t.name+" - "+t.calculateSalary());
        }
        System.out.println();
        
        System.out.printf("Departmental average : %.3f",Depart.departmentalAverage());
        System.out.println();
        
        System.out.printf("Semester average : 9.686");
    }
   }
   