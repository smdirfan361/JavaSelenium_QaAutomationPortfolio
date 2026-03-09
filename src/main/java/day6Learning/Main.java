package day6Learning;

public class Main {
    public static void main(String[] args){
        ExceptionHandling excp = new ExceptionHandling();
        try{
            excp.processloan(7000,12);
        }catch (ArithmeticException e){
            System.out.println("Exception as: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception as: "+e.getMessage());
        }finally {
            System.out.println("Loan processing attempt complete");
        }

        try{
            excp.processloan(7000,0);
        }catch (ArithmeticException e){
            System.out.println("Exception as: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception as: "+e.getMessage());
        }finally {
            System.out.println("Loan processing attempt complete");
        }

        try{
            excp.processloan(-7000,12);
        }catch (ArithmeticException e){
            System.out.println("Exception as: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception as: "+e.getMessage());
        }finally {
            System.out.println("Loan processing attempt complete");
        }

        try{
            excp.applyLoan(100);
        }catch (ArithmeticException e){
            System.out.println("Exception as: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception as: "+e.getMessage());
        }finally {
            System.out.println("Loan approval Stage");
        }

        try{
            excp.applyLoan(7000000);
        }catch (ArithmeticException e){
            System.out.println("Exception as: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception as: "+e.getMessage());
        }finally {
            System.out.println("Loan approval Stage");
        }

        try{
            excp.applyLoan(70000);
        }catch (ArithmeticException e){
            System.out.println("Exception as: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exce[tion as: "+e.getMessage());
        }finally {
            System.out.println("Loan approval Stage");
        }


    }

}
