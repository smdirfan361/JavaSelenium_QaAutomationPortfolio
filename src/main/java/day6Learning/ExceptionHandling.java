package day6Learning;

public class ExceptionHandling {

    void processloan(double amount,int months) throws  ArithmeticException {
        if (months == 0){
            throw new ArithmeticException("Months can not be zero");
        }
        if (amount < 0){
            throw new ArithmeticException("Amount can not be negative");
        }
        double emi = amount/months;
        System.out.println("EMI: "+emi);
    }

    class InvalidLoanAmountException extends Exception {
        InvalidLoanAmountException(String message){
            super(message);
        }
    }

    void applyLoan(double amount) throws InvalidLoanAmountException {
        if (amount <1000){
            throw new InvalidLoanAmountException("Amount is too low");
        }else if ( amount >100000){
            throw  new InvalidLoanAmountException("Amount is too high");
        }else{
            System.out.println("Your loan will be approved shortly");
        }

    }
}
