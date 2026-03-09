package day4Learning;

public class Validatebank {
    public static void main(String[] args) {

        SavingAccount acc1 = new SavingAccount(0.05,"1234","Jude",3000);
        CurrentAccount acc2 = new CurrentAccount(5000,"12345","Ding",24000);
        acc1.deposit(20000);
        acc1.accountSummary();
        acc1.addInterest();
        acc1.withdraw(2000);
        acc1.accountSummary();

        acc2.withdraw(29000);
        acc2.accountSummary();

    }

}
