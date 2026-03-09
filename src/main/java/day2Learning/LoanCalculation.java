package day2Learning;

public class LoanCalculation {

    String customerName;
    double amount;

    void checkEligibility (){
        if(amount>=10000 && amount<=100000){
          System.out.println(customerName+" Eligible fot loan amount of "+amount);
        }else {
            System.out.println(customerName + " Not eligible for loan amount of " + amount);
        }
    }

    void calculateEMI(double rate, int months){
        double emi = (amount * rate * Math.pow(1 + rate, months))/ (Math.pow(1 + rate, months) - 1);
        System.out.println("EMI: " + Math.round(emi));
    }


}
