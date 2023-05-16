package Passwordvalidation;

import java.util.Scanner;

public class password {
    Scanner sc= new Scanner(System.in);
    String pass="";
    void in(){
        do{
            System.out.println("Enter the password:\t");
            pass=sc.next();
        }while(pass.length()<=8);
        System.out.println("-------!Process started for password verification!-------");
        verification();
    }
    void verification(){
        Boolean num=false,caps=false,small=false;
        int[] a=new int[9];
        for (int i : a) {
            a[i]=i;
        }
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i)==a[i]){
                num=true;
                break;
            }
            else if(pass.charAt(i)=='A' || pass.charAt(i)=='B' || pass.charAt(i)=='C'){
                caps=true;
                break;
            }
            else if(pass.charAt(i)=='a' || pass.charAt(i)=='b' || pass.charAt(i)=='c'){
                small=true;
                break;
            }
        }
        if(num==true && caps==true){
            if(small==false){
                System.out.println("invalid password\n");
            }
            else{
                System.out.println("correct password genrated");
            }
        }
    }
}
