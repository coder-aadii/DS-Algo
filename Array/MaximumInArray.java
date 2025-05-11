package Array;

public class MaximumInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 47, 6, 42, 6, 13, 44, -76 };

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
                max = arr[i];
        }
        System.out.println(max + " is the maximum element in the array.");
    }
}
