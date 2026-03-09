package dsaDay3;

public class TwoSum {
    public static void main(String[] args) {
        int [][] array = { {2,7,11,15}, {3,5,8,12}, {1,2,3,4} };
        int[] target = {9, 20, 10};
        for (int t = 0; t < array.length; t++) {
            boolean found = false;
            for (int i = 0; i < array[t].length; i++) {
                for (int j = i+1; j < array[t].length ; j++) {
                    if (array[t][i]+array[t][j] ==  target[t]){
                        System.out.println("Index " + i + " and " + j + " — values: " + array[t][i] + " + " + array[t][j] + " = " + target[t]);
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if(!found){
                System.out.println("Test case "+t+" - no pair found");
            }
        }
    }
}
