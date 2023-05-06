package Bankclassproblem;
public class bank {
    int acno,balance;
    String name;
    bank(int Acc,int bal,String Name){
        acno=Acc;
        balance=bal;
        name=Name;
    }
    void deposit(int amount){
        balance=balance+amount;
        System.out.println("The deposition made is "+amount);
    }
    void withdrawal(int amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("The Withdrawal made is "+amount);
        }
        else
            System.out.println("Insufficient balance");
    }
    void transfer(bank a,int amt,bank b){
        if(a.balance>=amt){
            a.balance=a.balance-amt;
            b.balance=b.balance+amt;
        }
        else
            System.out.println("Low Balance");
    }
    void display(){
        System.out.println("Account number: "+acno);
        System.out.println("Balance is Account: "+balance);
        System.out.println("Name: "+name);
    }
}
