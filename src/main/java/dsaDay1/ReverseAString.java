package dsaDay1;

public class ReverseAString {
    public static void main(String[] args){
        String value =  "automation";
        // output :  noitamotua
        String reversed ="";
        for (int i = value.length()-1;i >= 0;i--){
             reversed = reversed+value.charAt(i);
        }

        System.out.println("Reversed String: "+reversed);
    }
}
