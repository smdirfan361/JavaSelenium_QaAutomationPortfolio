package day2Learning;

public class MainTest {
    public static void main(String[] args){
        TestCase test1 = new TestCase();
        test1.testCaseName="Login Validation";
        test1.module = "Authentication";
        test1.status = "Passed";
        test1.executionTime = 3;

        test1.printSummary();
        test1.makeAsPassed();

        boolean isAuto1= test1.isAutomated();
        System.out.println(test1.testCaseName+" is automated "+isAuto1);

        System.out.println("----------------------------------------------------------");
        TestCase test2 = new TestCase();
        test2.testCaseName="Payment Processing";
        test2.module = "Banking";
        test2.status = "Pending";
        test2.executionTime = 10;

        test2.printSummary();
        test2.makeAsFailed();

        boolean isAuto2= test2.isAutomated();
        System.out.println(test2.testCaseName+" is automated "+isAuto2);


    }
}
