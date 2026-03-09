package day7MiniProject;

public class TestCase {

    private String testCaseName;
    private String module;
    private String status;
    private double executionTime;

    TestCase(String testCaseName, String module, String status, double executionTime) {
        this.testCaseName = testCaseName;
        this.module = module;
        this.executionTime = executionTime;

        if (status.equalsIgnoreCase("Pass") || status.equalsIgnoreCase("Fail") || status.equalsIgnoreCase("Pending")) {
            this.status = status;
        }else {
            this.status = "Pending";
        }

        if (executionTime < 0 ) {
            this.executionTime = 0.0;
            System.out.println("ExecutionTime cannot be negative");
        }

    }

    String getTestCaseNme(){
        return testCaseName;
    }

    String  getModule(){
           return  module;
    }

    String getstatus(){
       return status;
    }

    double getExecutionTime(){
        return executionTime;
    }

    void updateStatus(String newStatus){
        if (newStatus.equalsIgnoreCase("Pass") || newStatus.equalsIgnoreCase("Fail") || newStatus.equalsIgnoreCase("Pending")) {
            this.status = newStatus;
            System.out.println(testCaseName+" Status is Updated: "+newStatus);
        }else {
            System.out.println("Invaild Status -- Must be pass , fail or pending ");
        }

    }

    void printSummary(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("Test Case Name: "+testCaseName);
        System.out.println("Module Name   : "+module);
        System.out.println("Status        : "+status);
        System.out.println("Execution Time: "+executionTime);

        System.out.println("---------------------------------------------------------------");
    }

    String getFormatedName(){
        String name = testCaseName.trim().toUpperCase();
        return name;
    }

}

