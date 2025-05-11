package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.print("Enter elements to be rotate : ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int start = 0, end = arr.length - 1;

        reverse(arr, start, k - 1);
        reverse(arr, k, end);
        reverse(arr, 0, end);

        System.out.println("Array rotated by " + k + " elements :" + Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
