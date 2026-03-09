package day3Learning;

public class TestMain {
    public static void main(String[] args) {
        BankAccount  acc1 = new BankAccount("123456","Higed",60000,true);
        acc1.printSummary();
        acc1.deposit(1000);
        acc1.withdraw(-500);
        System.out.println("========================================");

        BankAccount acc2 = new BankAccount("23456","hufu",-3000,true);
        acc2.printSummary();
        acc2.deposit(25000);
        acc2.withdraw(400);
    }
}
