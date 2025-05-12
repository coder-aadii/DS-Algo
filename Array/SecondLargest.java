package Array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        // int[] arr = { 1, 5, 47, 6, 42, 6, 13, 44, 7 };
        // int[] arr = {1};
        int[] arr = { 10, 10, 10, 10 };
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        System.out.println(Arrays.toString(arr));

        if (arr.length < 2) {
            System.out.println("Arrays only has 1 element.");
        }
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest in the array.");
        } else {
            System.out.println(secondLargest + " is the second largest element in the array.");
        }
    }
}