package day2Learning;

public class Main {
    public static void main(String[] args){

        LoanCalculation loan1 =new LoanCalculation();
        loan1.amount = 10000;
        loan1.customerName ="Raxi";
        loan1.checkEligibility();
        loan1.calculateEMI(0.025,12);

        LoanCalculation loan2 =new LoanCalculation();
        loan2.amount = 1000;
        loan2.customerName ="Razi";
        loan2.checkEligibility();

    }
}
