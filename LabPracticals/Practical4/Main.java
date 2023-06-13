// package LabPracticals;
public class Main {
    public static void main(String[] args) {
        BankAccounts b=new BankAccounts(76184, 983179498, "Yogi");
        b.openAccount();
        b.deposit(10000);
        b.withdraw();
        b.openAccount();
        int transfer=(int)b.closeAccount();
        double balance=b.return_balance();
        FixedDeposit a=new FixedDeposit(76184,983179498,7.5,"HELLO",5,balance);
        a.account_number();
        a.updateinterest();
        a.closeAccount();
        a.updateinterest();
        a.openAccount();
        a.withdraw();
        a.openAccount();
        SavingAccount s=new SavingAccount(9741,79349,"Yogi",balance);
        s.Debitable(transfer);
        s.display();
    }
}
