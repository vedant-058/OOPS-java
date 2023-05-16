package LabPracticals.Practical3;
public class Main {
    public static void main(String[] args) {    
        College c[]=new College[3];
        c[0]=new placement("Vedant Tiwari","CSE",9.49,"MICROSOFT",4900000,31846);   
        c[0].display(); 
        c[1]=new Studies("Anshuk Mishra","CSE",9.49,"M.TECH","IIT DELHI",31846,"GATE",890);   
        c[1].display(); 
        c[2]=new Entrepreneurship("Prathmesh Rajankar", "CSE", 9.1, "APPLE MINI", "PRIVATE", 1924000, 98800);
        c[2].display();
    }
}

