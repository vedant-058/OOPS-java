package LabPracticals.Practical3;

public class College {
    String name,branch;
    Double cgpa;
    College(String name,String branch,Double cgpa){
        this.name=name;
        this.branch=branch;
        this.cgpa=cgpa;
    }    
    void display(){
        System.out.println("\n\n\n");
        System.out.println("!______***** College Student *****______!");
        System.out.println("NAME: "+name);
        System.out.println("COLLEGE PASSED WITH: "+branch);
        System.out.println("CGPA: "+cgpa);
        System.out.println("\n\n\n");
    }
}
class placement extends College{
    String company;
    int letter,Salary;
    placement(String name,String branch,Double cgpa,String industry_name,int annual_package,int joining_letter_number){
        super(name, branch, cgpa);
        company=industry_name;
        Salary=annual_package;
        letter=joining_letter_number;
    }
    void display(){
        System.out.println("\n\n\n");
        System.out.println("!______***** Placement Student *****______!");
        System.out.println("NAME: "+name);
        System.out.println("COLLEGE PASSED WITH: "+branch);
        System.out.println("CGPA: "+cgpa);
        System.out.println("COMPANY PLACED IN: "+company);
        System.out.println("LETTER NUMBER: "+letter);
        System.out.println("ANNUAL PACKAGE: "+Salary);
        System.out.println("\n\n\n");
    }
}
class Studies extends College{
    String Degree,College,exam;
    int Score,Admission_Letter_Number;
    Studies(String name,String branch,Double cgpa,String Degree_Name, String College_Name,int Admission_Letter_Number, String exam_Name, int Score){
        super(name, branch, cgpa);
        Degree=Degree_Name;
        College=College_Name;
        exam=exam_Name;
        this.Score=Score;
        this.Admission_Letter_Number=Admission_Letter_Number;
    }
    void display(){
        System.out.println("\n\n\n");
        System.out.println("!______***** Higher Studies Student *****______!");
        System.out.println("NAME: "+name);
        System.out.println("COLLEGE PASSED WITH: "+branch);
        System.out.println("CGPA: "+cgpa);
        System.out.println("DEGREE PURSUING CURRENTLY: "+Degree);
        System.out.println("COLLEGE NAME: "+College);
        System.out.println("APPEARED FOR EXAM: "+exam);
        System.out.println("SCORE OF EXAM: "+Score);
        System.out.println("ADDMISSION LETTER NUMBER: "+Admission_Letter_Number);
        System.out.println("\n\n\n");
    }
}
class Entrepreneurship extends College{
    String Company_Name,Sector;
    int Employees;
    double turnover;
    Entrepreneurship(String name,String branch,Double cgpa,String Company_Name,String Sector,int Employees,double turnover){
        super(name, branch, cgpa);
        this.Company_Name=Company_Name;
        this.Sector=Sector;
        this.Employees=Employees;
        this.turnover=turnover;
    }
    void display(){
        System.out.println("\n\n\n");
        System.out.println("!______***** Entrepreneurship Student *****______!");
        System.out.println("NAME: "+name);
        System.out.println("COLLEGE PASSED WITH: "+branch);
        System.out.println("CGPA: "+cgpa);
        System.out.println("COMPANY HOLDING CURRENTLY: "+Company_Name);
        System.out.println("SECTOR: "+Sector);
        System.out.println("NUMBER OF WORKING EMPLOYEES: "+Employees);
        System.out.println("TURNOVER: "+turnover+" Crores");
        System.out.println("\n\n\n");
    }

} 