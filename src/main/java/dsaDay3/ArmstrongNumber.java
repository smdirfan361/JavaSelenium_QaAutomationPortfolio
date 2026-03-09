package dsaDay3;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        int n = 123;
        int [] testcase = {153,371,123};

        for (int n : testcase){
            int temp = n;
            int sum = 0;

            int digits =String.valueOf(n).length();

            while (temp > 0){
                int digit = temp%10;
                sum +=(Math.pow(digit,digits));
                temp = temp/10;
            }
            if(sum == n){
                System.out.println(n+" is an amrstrong number");
            }else {
                System.out.println(n+" is not an amrstrong number");
            }

        }

    }
}
