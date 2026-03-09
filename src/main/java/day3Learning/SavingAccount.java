package day3Learning;

public class SavingAccount {
    private String accountNumber, accountHolder;
    private double balance, interestRate;

    SavingAccount(String accountNumber,String accountHolder,double balance, double interestRate){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;

        if (balance <0){
            System.out.println("Invalid Amount");
            this.balance = 0;
        }else {
            System.out.println("Balance: "+balance);
        }

        if (interestRate>0.20){
            System.out.println("Invalid rate");
            this.interestRate=0.05;
        }

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public double getInterestRate(){
        return interestRate;
    }

    void deposit(double amount){
        if (amount <=0){
            System.out.println("Invalid amount");
        }else{
            balance =balance+amount;
            System.out.println("Deposited amount: "+amount+" | New Balance: "+balance);
        }
    }

    void withdraw(double amount){
        if (amount<=0){
            System.out.println("Invalid amount");
        }else if( balance <amount){
            System.out.println("Insufficent amount");
        }else {
            balance = balance-amount;
            System.out.println("Withdraw successfull");
            System.out.println("withdrawn amount: "+amount+" | Remaing Balance: "+balance);
        }
    }

    void addnterest(){
        if (balance < 0){
            System.out.println("balance is in negative please deposit amount");
        }else if (balance ==0){
            System.out.println("Balance is zero please deposit amount");
        }else{
            double calculateInterest = balance*interestRate;
            balance = balance + calculateInterest;
            System.out.println("Interest Obtained: "+calculateInterest+ " | Total Balance: "+balance);
        }

    }

    void accoubtSummary(){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
        System.out.println("Rate of Interest: "+interestRate);
        System.out.println("------------------------------------------------------------------------------");
    }


}
