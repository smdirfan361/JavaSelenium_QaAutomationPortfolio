package day3Learning;

public class SavingMain {
    public static void main(String[] args) {
        SavingAccount acc1 = new SavingAccount("123456","Hede",50000,0.05);
        acc1.deposit(10000);
        acc1.withdraw(5000);
        acc1.addnterest();
        acc1.accoubtSummary();

        System.out.println("------------------------------------------------------------------------------");
        SavingAccount acc2 = new SavingAccount("234523","deku",-500,0.50);
        acc2.withdraw(1000);
        acc2.getInterestRate();
        acc2.deposit(20000);
        acc2.addnterest();
        acc2.accoubtSummary();

    }
}
