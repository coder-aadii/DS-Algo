package Miscellaneous;

public class Q_49_ArmstrongNumber {
    public static void main(String[] args) {
        int num = 9474;
        int original = num;
        int temp = num;
        int digits = 0;

        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }
        // System.out.printf("There are %d digits in %d.\n", digits, num);

        double sum = 0;
        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        if ((int) sum == num)
            System.out.println(num + " is an Armstrong Number.");
        else
            System.out.println(num + " is not an Armstrong Number.");
    }
}
