package day5Learning;
import java.util.ArrayList;
import java.util.HashMap;

public class TestDataManager {
    public static void main(String[] args){

        //Part 1
        ArrayList<String> testCaseNames = new ArrayList<>();
        testCaseNames.add("Game Test");
        testCaseNames.add("Integration Test");
        testCaseNames.add("Smoke Test");
        testCaseNames.add("Sanity Test");
        testCaseNames.add("Login Test");
        for(String tc : testCaseNames){
            System.out.println("Test Name: "+tc);
        }

        System.out.println("Size of array before removing element: "+testCaseNames.size());
        testCaseNames.remove(1);
        System.out.println("Size of array after removing Element: "+testCaseNames.size());
        System.out.println(testCaseNames.contains("Login Test"));

        //part 2
        HashMap<String,String> bankLoginData = new HashMap<>();
        bankLoginData.put("username","Irfan1234");
        bankLoginData.put("password","Testlog1");
        bankLoginData.put("url","https://www.google.com");
        bankLoginData.put("browser","Chrome");
        bankLoginData.put("Environment","Deva");
        System.out.println("password: "+bankLoginData.get("password"));
        System.out.println(bankLoginData.containsKey("timeout"));
        System.out.println("Size of Hashmap before removal: "+bankLoginData.size());
        bankLoginData.remove("browser");
        System.out.println("Size of Hashmap after removal: "+bankLoginData.size());

        for (String key : bankLoginData.keySet()){
            System.out.println(key +" -> "+bankLoginData.get(key));
        }

        //part 3
        String  raw = " Welcome to Gulf Bank Portal ";
        String  test = "Loans,Payments,Dashboard,Profile";
        System.out.println(raw.trim());
        System.out.println(raw.toLowerCase());
        System.out.println(raw.contains("Gulf"));
        System.out.println(raw.replace("Gulf","National"));
//        System.out.println(test.split(","));
        for (String i : test.split(",")){
            System.out.println(i);
        }
        System.out.println("Hello".equalsIgnoreCase("hello"));


    }

}
