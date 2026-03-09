package dsaDay2;

import java.util.ArrayList;

public class VowelCounter {
    public static void main(String[] args) {
        String name = "Hello World";
        String loweredString = name.trim().toLowerCase();
        int count = 0;
        ArrayList<Character> seen = new ArrayList<Character>();
        for (int i = 0; i < name.length(); i++) {
            char c = loweredString.charAt(i);
            if ("aeiou".contains(String.valueOf(c)) && !seen.contains(c)) {
                seen.add(c);
                count++;
            }

        }
        System.out.println("Total count used vowels: "+count);


    }



}
