package day7MiniProject;

public class Main {
    public static void main(String[] args) {
        TestReport report = new TestReport();

        report.addEnvironment("Browser","Chrome");
        report.addEnvironment("url","https://www.gulfbank.com/uat");
        report.addEnvironment("Envt","UAT");

        TestCase tc1 = new TestCase("Login Test","Login","Pass",3.2);
        TestCase tc2 = new TestCase("Payment Test","Payment","Pass",3);
        TestCase tc3 = new TestCase("Otp Test","Payment","Fail",-1);

        try {
            report.addTestCase(tc1);
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            System.out.println("End of try and catch executed finally block");
        }

        try {
            report.addTestCase(tc2);
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            System.out.println("End of try and catch executed finally block");
        }

        try {
            report.addTestCase(tc3);
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            System.out.println("Test case add attempt complete");
        }


        CriticalTestCase ct1 = new CriticalTestCase("High","Login Test","Login","Pass",2.0);
        CriticalTestCase ct2 = new CriticalTestCase("Medium","Payment Test","Payments","Fail",-1);


        try {
            report.addTestCase(ct1);

        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            System.out.println("Test Execution Completed");
        }

        try {
            report.addTestCase(ct2);

        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            System.out.println("Test Execution Completed");
        }

        TestCase emptyTC = new TestCase("","Login","pass",2);

        try{
            report.addTestCase(emptyTC);
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            System.out.println("Empty TestCase validation completed ");
        }

        report.printEnvironment();
        report.printAllTest();
        report.printSummaryReport();



    }
}
