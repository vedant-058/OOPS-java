// package LabPracticals;
// import java.util.random.*;
import java.util.*;
interface Debitable{
    void withdraw();
}
class BankAccounts implements Debitable{
    Scanner sc =new Scanner(System.in);
    double accNum,aadhar,ROI,balance=0;
    String owner_name;
    BankAccounts(double accNum,double aadhar,String owner_name){
        this.accNum=accNum;
        this.aadhar=aadhar;
        this.owner_name=owner_name;
    }
    void openAccount(){
        System.out.println("Account owner name: "+owner_name);
        System.out.println("Account number: "+accNum);
        System.out.println("Balance in Account: "+balance);
        System.out.println("Account Opened!.");
    }
    void deposit(double amount){
        if(balance==0)
            System.out.println("0/- Balance");
        balance+=amount;
        System.out.println(amount+"/- Deposited.");
    }
    
    double closeAccount(){
        System.out.println("Account closed.");
        double x=return_balance();
        balance=0;
        return x;
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
    double return_balance(){
        return balance;
    }
}

class FixedDeposit extends BankAccounts{
    double lockInPeriod;int t;
    double balance,ROI;
    FixedDeposit(double accNum,double aadhar,double ROI, String owner_name,double lockInPeriod,double balance){
        super(accNum,aadhar,owner_name);
        this.lockInPeriod=lockInPeriod;
        this.balance=balance;
        this.ROI=ROI;
    }
    void account_number(){
        int a[]=new int[5];
        // double p=accNum;
        a[0]=5;
        a[1]=5;
        Random rand=new Random();
        for (int i = 2; i < a.length; i++) {
            a[i]=rand.nextInt(9);
        }
        System.out.println("Acc number of FD: ");
        int num=0;
        for (int i = 0; i < a.length; i++) {
            num=num*10+a[i];
        }
        System.out.println(num);
    }
    void updateinterest(){
        double si;
        System.out.println("Enter the Time for which FD is done: ");
        t=sc.nextInt();
        // int p=sc.nextInt();
        System.out.println("Balance before intrest : "+balance);
        si=balance*ROI*t;
        balance+=(si*0.01);
        System.out.println("Intrest : "+si*0.01);
        System.out.println("Balance After intrest : "+balance);
    } // override the method of bankaccount
    void close_Account(){
        if(lockInPeriod>t){
            System.out.println("As you are closing account before Lock in Period 5% deducted : "+balance*0.05+" is deducted.");
            balance-=0.05*balance;
            System.out.println("Rest balance is: "+balance);
        }
        else{
            System.out.println("After successfull time completion Balance is: "+balance);
        }
    } // override the method close account before lockInPeriod
}
class SavingAccount extends BankAccounts{
    Scanner sc =new Scanner(System.in);
    double accNum,aadhar,ROI,balance=0;
    String owner_name;
    SavingAccount(double accNum,double aadhar,String owner_name,double balance){
        super(accNum, aadhar, owner_name);
        this.balance=balance;
    }
    void Debitable(int amount){
        balance+=amount;
    }
    int account_number(){
        int a[]=new int[5];
        // double p=accNum;
        a[0]=1;
        a[1]=1;
        Random rand=new Random();
        for (int i = 2; i < a.length; i++) {
            a[i]=rand.nextInt(9);
        }
        System.out.println("Acc number of FD: ");
        int num=0;
        for (int i = 0; i < a.length; i++) {
            num=num*10+a[i];
        }
        return (num);
    }

    void display(){
        System.out.println("Saving account number: "+account_number());
        System.out.println("Name: "+owner_name);
        System.out.println("Balance in Saving acc: "+balance);
    }
}