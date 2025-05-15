package Miscellaneous;

public class ArmstrongNumberUptoN {
    public static void main(String[] args) {
        int num = 1000;

        for (int i = 1; i <= num; i++) {
            int digits = 0;
            int temp = i;
            double sum = 0;

            while (temp != 0) {
                temp = temp / 10;
                digits++;
            }

            temp = i;

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(i + " is an Armstrong Number.");
            }
        }
    }
}
