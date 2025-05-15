package Loops;

public class FibonacciRecursion {

    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.print("Fibonacci Series upto " + num + " digits : ");
        for (int i = 0; i <= num; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
