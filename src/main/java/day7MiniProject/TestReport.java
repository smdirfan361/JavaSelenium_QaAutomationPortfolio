package day7MiniProject;

import java.util.ArrayList;
import java.util.HashMap;

public class TestReport {

    ArrayList<TestCase> testCase = new ArrayList<>();
    HashMap<String,String> testEnvironment = new HashMap<>();

    TestReport(){
        this.testCase = new ArrayList<>();
        this.testEnvironment = new HashMap<>();

    }

    void addTestCase(TestCase tc) throws  InvalidTestDataException{
        if (tc.getTestCaseNme().trim().isEmpty()){
            throw new  InvalidTestDataException("Test Case name cannot be empty");
        }else {
            testCase.add(tc);
        }
    }
    
    void  addEnvironment(String Key, String value){
        testEnvironment.put(Key,value);
    }
    
    void printAllTest(){
        for(TestCase tc : testCase){
            tc.printSummary();
        }
    }

    void printEnvironment(){
        for (String tc: testEnvironment.keySet()){
            System.out.println(tc+" - > "+testEnvironment.get(tc));
        }

    }

    int getTotalTests(){
        return testCase.size();
    }

    int getPassCount(){
        int count = 0;
        for(TestCase tc: testCase){
            if (tc.getstatus().equalsIgnoreCase("pass")){
                count++;

            }
        }
        return count;
    }

    void printSummaryReport(){
        System.out.println("Total Test: "+getTotalTests());
        System.out.println("Total Passed Test: "+getPassCount());
        System.out.println("Total Failed Test: "+ (getTotalTests()- getPassCount()));
    }


}
