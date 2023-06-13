public class student {
    String name,password,en;
    double cgpa;
    student(String name,double cgpa,String en,String pass){
        this.name=name;
        this.cgpa=cgpa;
        this.en=en;
        password=pass;
    }
    void checkcgpa(){
        try{
            if(cgpa<0 || cgpa>10){
                throw new Exception();
            }
        System.out.println("Valid CGPA: "+cgpa);
        }
        catch (Exception e) {
            System.out.println("Invalid CGPA: "+cgpa);
        }
    }
    void checken(){

        String[] degrees={"BE"};
        String[] branches={"CSU", "ENU", "ECU", "EEU"};

        String degree=en.substring(0,2);
        int year=Integer.parseInt(en.substring(2,4));
        String branch=en.substring(4,7);
        String roll=en.substring(7);

        try{
            for(int i=0;i<degrees.length;i++){
                if(!degree.equals(degrees[i])) {
                    throw new Exception();
                }
            }
            System.out.println("Valid Degree: "+degree);
        }
        catch (Exception e){
            System.out.println("Invalid Program No such degree found"+degree);
        }
        try{
            if(year<20 || year>23){
                throw new Exception();
            }
            System.out.println("Valid Year: "+year);
        }
        catch (Exception e){
            System.out.println("Invalid Year found in the enrollment number, no such year "+year);
        }
        try{
            int flag=0;
            for (int i = 0; i < branches.length; i++) {
                if(branch.equals(branches[i])){
                    flag=1;
                }
            }
            if(flag==0){
                throw new Exception();
            }
            System.out.println("Valid Branch: "+branch);
        }
        catch(Exception e){
            System.out.println("Invalid Branch No such branch found for such Program: "+branch);
        }
        try{
            int x=Integer.parseInt(roll);
            if(x<1 || x>250){
                throw new Exception();
            }
            System.out.println("Valid Roll Number: "+roll);
        }
        catch (Exception e){
            System.out.println("Invalid Roll number, no such exists: "+roll);
        }
    }
    void checkpass(){
        char[] pass=password.toCharArray();
        int flag[]=new int[4];
        flag[0]=0;
        flag[1]=0;
        flag[2]=0;
        flag[3]=0;
        try{
            if(pass.length<8){
                throw new Exception();
            }
            System.out.println("Valid Length of password 8 or more Character present");
        }
        catch (Exception e){
            System.out.println("Minimum 8 Character needed,Invalid Length of Password: "+pass);
        }
        for (int i = 0; i < pass.length; i++) {
            if(Character.getNumericValue(pass[i])>=65 || Character.getNumericValue(pass[i])<=90){
                flag[0]=1;
            }
            if (Character.getNumericValue(pass[i])>=97 || Character.getNumericValue(pass[i])<=122) {
                flag[1]=1;
            }
            if (Character.getNumericValue(pass[i]) >=48 || Character.getNumericValue(pass[i])<=57) {
                flag[2]=1;
            }
            if (pass[i]=='!' || pass[i]=='$' || pass[i]=='%' || pass[i]=='*' || pass[i]=='&') {
                flag[3]=1;
            }
        }
        try{
            if(flag[0]!=1){
                throw new Exception();
            }
            System.out.println("Uppercase Character: PRESENT");
        }
        catch (Exception e){
            System.out.println("Absence of Uppercase Character");
        }try{
            if(flag[1]!=1){
                throw new Exception();
            }
            System.out.println("Lower Character: PRESENT");
        }
        catch (Exception e){
            System.out.println("Absence of Lower Character");
        }try{
            if(flag[2]!=1){
                throw new Exception();
            }
            System.out.println("Number: PRESENT");
        }
        catch (Exception e){
            System.out.println("Absence of Number");
        }try{
            if(flag[3]!=1){
                throw new Exception();
            }
            System.out.println("Special Character: PRESENT");
        }
        catch (Exception e){
            System.out.println("Absence of Special Character");
        }
    }
    void allchecks(){
        System.out.println();
        checkcgpa();
        System.out.println();
        checken();
        System.out.println();
        checkpass();
    }
}
