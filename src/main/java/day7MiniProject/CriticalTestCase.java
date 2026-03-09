package day7MiniProject;

public class CriticalTestCase extends TestCase{
    private  String  severity;

    CriticalTestCase(String severity, String testCaseName, String module, String status, double executionTime)  {

        super(testCaseName, module, status, executionTime);

    if (severity.equalsIgnoreCase("High") || severity.equalsIgnoreCase("Medium" )|| severity.equalsIgnoreCase("Low")){
        this.severity =  severity;
    }else {
        this.severity = "Medium";
    }

    }

    String getSeverity(){
        return severity;
    }

    @Override
    void printSummary(){
        super.printSummary();
        System.out.println("Severity level : "+severity);
    }



}
