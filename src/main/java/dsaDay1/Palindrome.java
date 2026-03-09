package dsaDay1;

public class Palindrome {
    public static  void  main(String[] args){
        String value =  "madam";
        String reversed ="";
        for (int i = value.length()-1;i >= 0;i--){
            reversed = reversed+value.charAt(i);
        }
        if (reversed.equalsIgnoreCase(value)){
            System.out.println(value+" is palindrome");
        }else {
            System.out.println(value+" is not a palindrome");
        }
    }
}
