package Miscellaneous;

public class Q_50_SumUptoSeries {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.printf("The sum up to %d is %d.\n", num, sum);

        int n = 15;
        int result = n * (n + 1) / 2; // O(1) time more optimal
        System.out.println("SUM = " + result);

    }
}