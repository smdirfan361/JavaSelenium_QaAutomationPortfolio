package day3Learning;

public class BankAccount {
     private  String accountNumber,accountHolder;
     private  double balance;
     private boolean isActive;

     BankAccount(String accountNumber, String accountHolder, double balance, boolean isActive) {
         this.accountHolder = accountHolder;
         this.accountNumber = accountNumber;
         this.balance = balance;
         this.isActive = isActive;

         if (balance < 0){
             System.out.println("Invalid balance -- setting it to 0");
             this.balance = 0;
         }else {
             this.balance = balance;
         }
     }

    public String getaccountNumber(){
         return  accountNumber;
    }

    public String getAccountHolder(){
        return  accountHolder;
    }

    public double getBalance(){
        return  balance;
    }

    public boolean isActive(){
        return  isActive;
    }

    void deposit(double amount){
         if (amount <=0){
             System.out.println("Invalid deposit amount");
         }else{
             balance = balance+amount;
             System.out.println("Deposited: "+amount+" | New Balance: "+balance);
         }
    }

    void  withdraw(double amount){
         if (amount <=0){
             System.out.println("Invalid amount");
         }else if(amount>balance){
            System.out.println("Insufficient funds | Available: "+balance);
        }else {
             balance=balance-amount;
             System.out.println("withdrawn: "+amount+" | New Balance: "+balance);
         }
    }


    void printSummary(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Available Balance: "+balance);
        System.out.println("Status: "+(isActive ? "Active":"InActive"));
        System.out.println("-----------------------------------------------------------------");
    }
}

