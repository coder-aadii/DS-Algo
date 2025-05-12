package Array;

import java.util.Arrays;

public class SumOfAllElememts {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 47, 6, 42, 6, 13, 44, 7 };
        System.out.println(Arrays.toString(arr));
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of all elements in the array is " + sum);
    }
}
