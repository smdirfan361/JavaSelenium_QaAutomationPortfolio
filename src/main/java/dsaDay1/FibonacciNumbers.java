package dsaDay1;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a+" ");
            int c = b+a;
            a = b;
            b = c;
        }

    }
}
