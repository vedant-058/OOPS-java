
public class employee{
    int employeeid;
    String s;
    employee(int employeeid,    String s){
        this.employeeid=employeeid;
        this.s=s;
    }
    void display(String s){
        System.out.println("Name: "+s);
        System.out.println("ID: "+employeeid);
    }
}  
class permanent extends employee{
    double salary;
    permanent(int employeeid, String s, double earnings){
        super(employeeid, s);
        salary=earnings;
    }
    double tax(double salary){
        if(salary>500000){
            System.out.println("The Tax applied on the salary is: "+salary*0.2);
            salary=salary-salary*0.2;
            return salary;
        }
        else{
            System.out.println("The Tax applied on the salary is: "+salary*0.1);
            salary=salary-salary*0.1;
            return salary;
        }
    }
    void display(){
        display(s);
        System.out.println("The salary got is: "+tax(salary));        
    }
    
    void calculate(Double i,Double j){
        System.out.println("The Salary decided is: "+i*j);
        System.out.println(tax(i*j));
    }
}
class HourlyEmployee extends employee{
    double hrs,rate,salary;
    permanent b;
    HourlyEmployee(permanent a,double hrs,double rate){
        super(a.employeeid, a.s);
        this.hrs=hrs;
        this.rate=rate;
        this.salary=a.salary;
        b=a;
    }
    
    void display(){
        System.out.println("Hours worked: "+hrs);
        System.out.println("Rate: "+rate);
        b.calculate(hrs,rate);
    }
}