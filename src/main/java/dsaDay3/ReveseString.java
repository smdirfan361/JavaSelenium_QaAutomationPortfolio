package dsaDay3;

public class ReveseString {
    public static void main(String[] args) {
        String name = "hello";
        char[] chars = name.toCharArray();
        String reversed = "";

        for (int i = chars.length-1; i >=0 ; i--) {
            reversed = reversed+chars[i];
        }

        System.out.println("The reveresed string: "+reversed);

        String[] testWords = {"hellow","Java","Gulf"};
        for(String test : testWords){
            char[] charas = test.toCharArray();
            String reverse = "";
            for (int i = charas.length-1; i >=0 ; i--) {
                reverse = reverse+charas[i];
            }
            System.out.println("The reveresed string: "+reverse);
        }

    }

}
