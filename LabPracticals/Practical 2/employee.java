package Practical2;

public class employee {
    String name,designation;
    int id,age,salary,s;
    time t=new time(0,0,0);
    time x1=new time(10,30,15);
    time y1=new time(17,45,9);
    time x2=new time(1,32,55);
    time y2=new time(7,45,39);
    time x3=new time(9,30,15);
    time y3=new time(15,5,17);
    time x4=new time(19,30,50);
    time y4=new time(23,0,1);
    time x5=new time(10,39,17);
    time y5=new time(17,27,56);
    attendence q=new attendence(x1, y1);
    attendence w=new attendence(x2, y2);
       
    employee(String name,int id,int age,String designation,int salary){
        this.name=name;
        this.id=id;
        this.age=age;
        this.designation=designation;
        this.salary=salary;
    }
    void calculation(){
        t=w.attended(x2,y2);
    }

    void print(){
        System.out.println("Name: "+name+" ID: "+id+" Age: "+age+" Designation: "+designation+" Salary: "+salary);
        calculation();
    }
}
