package Loops;

public class Factorial {
    public static void main(String[] args) {
        int num = -8;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("The factorial of " + num + " is " + fact);
    }
}
