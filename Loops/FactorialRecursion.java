package Loops;

public class FactorialRecursion {
    public static void main(String[] args) {
        int num = 7;
        if (num < 0) {
            System.out.println("Factorial of negative integers is not possible.");
        } else {
            System.out.println("The Factorial of " + num + " is " + factorial(num));
        }
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
