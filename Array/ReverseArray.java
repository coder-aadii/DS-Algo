package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,5,47,6,42,6,13,44,7};

    int start = 0, end = arr.length-1;

    while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    
    System.out.println("The reversed array : " + Arrays.toString(arr));

    }    
}
