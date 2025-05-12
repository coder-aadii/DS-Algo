package Array;

public class EvenOddInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 8, 10, 13, 17 };

        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.printf("The number of even elements in the array is/are %d and odd is/are %d.", even, odd);
    }
}
