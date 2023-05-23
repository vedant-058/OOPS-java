package LabPracticals.Practical4;
import java.util.*;
interface Debitable{
    void withdraw();
}
class BankAccounts implements Debitable{
    Scanner sc =new Scanner(System.in);
    double accNum,aadhar,ROI,balance;
    String owner_name;
    BankAccounts(double accNum,double aadhar,double balance, String owner_name){
        this.accNum=accNum;
        this.aadhar=aadhar;
        this.balance=balance;
        this.owner_name=owner_name;
    }

    void openAccount(){
        System.out.print("Enter the name of the user: ");
        owner_name=sc.next();

    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited.");
    }
    void closeAccount(){
        System.out.println("Account closed.");
        balance=0;
    }
    void updateinterest(){
        balance+=balance*0.4;
        System.out.println("Balance added in the account.");
    }
    public void withdraw(){
        System.out.println("Enter the amount to be Withdrawal from the account.");
        double amnt=sc.nextDouble();
        if(amnt<=balance){
            System.out.println("Amount Withdrawal from account.");
            balance-=amnt;
        }
        else{
            System.out.println("Insufficiant Problem.");
        }
        
    }
}

class FixedDeposit extends BankAccounts{
    double lockInPeriod;
    // super();
    FixedDeposit(double accNum,double aadhar,double ROI,double balance, String owner_name,double lockInPeriod){
        super(accNum,aadhar,balance,owner_name);
        this.lockInPeriod=lockInPeriod;
    }
    void updateinterest(){
        double si,t;
        System.out.println("Enter the Time for which FD is done: ");
        t=sc.nextDouble();
        if()
        si=balance*ROI*t;

        balance+=(si*0.01);
    } // override the method of bankaccount
    void closeAccount(){
        balance-=0.05*balance;
        System.out.println("Time for closing the account.");
    } // override the method close account before lockInPeriod
}
class SavingAccount extends BankAccounts implements Debitable{

}