package day2Learning;

public class TestCase {
    String testCaseName;
    String module;
    String status;
    double executionTime;

    void printSummary(){
        System.out.println("TC: "+testCaseName+" | Module: "+module+" | Status: "+status+" | Time: "+executionTime);
    }

    void makeAsPassed(){
        status = "Pass";
        System.out.println("[\""+testCaseName+"\"]-----PASSED");
    }

    void makeAsFailed(){
        status = "Fail";
        System.out.println("[\""+testCaseName+"\"]-----FAILED");
    }

    boolean isAutomated(){
        if (executionTime< 5){
            return true;
        } else {
            return false;
        }
    }
}
