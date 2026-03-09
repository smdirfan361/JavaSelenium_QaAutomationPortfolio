package day4Learning;

public class BankAccount {
    private String accountNumber,accountHolder;
    protected double balance;

    BankAccount(String accountNumber,String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

        if (balance < 0){
            System.out.println("Your balance is in negative.Please deposite amount to keep operating.");
            this.balance = 0;
        } else if (balance ==0) {
            System.out.println("Your balance is zero.Please maintain 3000 to keep your account activated");
        }else {
            System.out.println("Your balance: "+balance);
        }

    }


    protected double getBalance() {
        return balance;
    }

    void deposit(double amount){
        if (amount <=0 ){
            System.out.println("please insert the amount. greater than zero");
        }else {
            balance = balance+amount;
            System.out.println("Deposited amount: "+amount+" | Total Balance: "+balance );
        }
    }

    void  withdraw(double amount){
        if (amount <=0 ){
            System.out.println("Please enter amount greater than zero");
        }else if (balance<amount){
            System.out.println("You have insufficent balance. Available Balance: "+balance);
        }else {
            balance = balance-amount;
            System.out.println("Withdrawn amount: "+amount+" | Total remaing Balance: "+balance);
        }
    }

    void accountSummary(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Available Balance: "+balance);
    }

}



class SavingAccount extends BankAccount{

    private double interestRate;

    SavingAccount(double interestRate,String accountNumber,String accountHolder,double balance){
        super(accountNumber,accountHolder,balance);
        this.interestRate = interestRate;

        if (interestRate > 0.20){
            System.out.println("Invaild interest Rate");
            this.interestRate = 0.05;
        }

    }

    void addInterest(){
        if (balance <= 0){
            System.out.println("Please deposit some amount");
        }else {
            double interst = balance*interestRate;
            balance = balance+interst;
            System.out.println("Interest Obtined: "+interst+" | Updated balance after the adding interest: "+balance);
        }
    }

    @Override
    void accountSummary(){
        super.accountSummary();
        System.out.println("Interest Rate: "+interestRate);
    }
}

class CurrentAccount extends BankAccount {

    private double overDraftLimit;

    CurrentAccount(double overDraftLimit,String accountNumber,String accountHolder, double balance){
        super(accountNumber,accountHolder,balance);
        this.overDraftLimit = overDraftLimit;

    }

    @Override
    void withdraw(double amount) {
        if (amount <=0 ){
            System.out.println("Please enter amount greater than zero");
        }else if (amount>(balance+overDraftLimit)){
            System.out.println("You have Exceeded the withdraw limit. MaxLimit: "+(balance+overDraftLimit));
        }else  {
            balance = balance-amount;
            System.out.println("Withdrawn amount: "+amount+" | Total remaing Balance: "+balance);

            if(balance<0 ){
                System.out.println("Overdraft amount is used. You owe the bank: "+ Math.abs(balance));
            }
        }
    }

    @Override
    void accountSummary(){
        super.accountSummary();
        System.out.println("Overdraft limit: "+overDraftLimit);
    }


}