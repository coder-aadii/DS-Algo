package Array;

public class PositiveNegative {
    public static void main(String[] args) {
        int [] arr = {2, -4, 6, 7, -7, 8, -4, 6, -89, -2, 9};

        int positive = 0, negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0)
                positive++;
            else
                negative++;
        }
        System.out.printf("There are %d positive and %d negative elements in the array.", positive, negative);
    }
}
