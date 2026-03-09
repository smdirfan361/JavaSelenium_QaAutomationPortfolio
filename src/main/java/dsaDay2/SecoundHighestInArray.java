package dsaDay2;

import java.util.ArrayList;

public class SecoundHighestInArray {
    public static void main(String[] args) {

        int[] numbers = {23,400,399,234,12,200};
        int higesstNumbers = 0;
        int secoundHighest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (higesstNumbers < numbers[i]){
                secoundHighest = higesstNumbers;
                higesstNumbers = numbers[i];
            } else if (numbers[i]>secoundHighest) {
                secoundHighest = numbers[i];
            }

        }

        System.out.println("Secound Highet number: "+secoundHighest);
        System.out.println("First Highet number: "+higesstNumbers);

    }
}
