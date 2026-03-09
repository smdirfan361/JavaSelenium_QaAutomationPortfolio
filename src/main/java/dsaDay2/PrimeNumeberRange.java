package dsaDay2;

public class PrimeNumeberRange {
    public static void main(String[] args) {
        int n = 7;

        System.out.println("The Prime numbers between 2 and "+n+" are: ");

        for (int i = 2; i <=n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <i ; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
