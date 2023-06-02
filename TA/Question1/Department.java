public class Department {
    String name;
    Student[] s;
    Teacher[] t;
    public Department(Student[] student, Teacher [] teacher, String name){
        this.name = name;
        s = student;
        t = teacher;
    }
    public double calculateAverageAge(){
        int sum = 0;
        double average;
        int l = s.length;
        for (Student student : s)
            sum += student.calculateAge();
        average = (double) sum /l;
        return average;
    }
    public int[] minMaxAge(){
        int[] ans = new int[2];
        ans[0] = t[0].calculateAge();
        ans[1] = t[0].calculateAge();
        for (Teacher teacher : t) {
            if (teacher.calculateAge() >= ans[1]) ans[1] =teacher.calculateAge();
            if (teacher.calculateAge() <= ans[0]) ans[0] =teacher.calculateAge();
        }
        return ans;
    }
    public double departmentalAverage(){
        double sum = 0;
        for(Student value : s)
            sum+=value.CGPA;
        return (sum/s.length);
    }
    public double semesterAverage(int n){
        double sum=0;
        int count = 0;
        for(Student s : s){
            if(s.semester==n) {
                sum+=s.CGPA;
                count++;
            }
        }
        return (sum/count);
    }
}
   