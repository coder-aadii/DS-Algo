package Array;

public class Average {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 8, 10, 13, 17 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];            
        }
        double avg = (double) sum / arr.length;
        // System.out.printf("%.2f is the average of all elements in the array\n", avg);
        System.out.println(avg + " is the average.");
    }
}
