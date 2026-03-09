package dsaDay2;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        System.out.println("---------------------------------------------");
        for (int i = 1; i <=n ; i++) {
            int previousValue = k;
            k =k*i;
            System.out.println(i+"*"+previousValue+"="+k);
        }
        System.out.println("---------------------------------------------");

        System.out.println("Factorial of "+n+" is "+k);


    }
}
