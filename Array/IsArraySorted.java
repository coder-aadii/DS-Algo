package Array;

public class IsArraySorted {
    public static void main(String[] args) {
        // int[] arr = { 1, 4, 5, 2, 1, 3, 6 };
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // int[] arr = {7, 6, 5, 4, 3, 2, 1};

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                isDecreasing = false;
            if (arr[i] > arr[i + 1])
                isIncreasing = false;
        }

        if (isIncreasing)
            System.out.println("The array is sorted in increasing order.");
        else if (isDecreasing)
            System.out.println("The array is sorted in decreasing order.");
        else
            System.out.println("The array is not sorted.");
    }
}
