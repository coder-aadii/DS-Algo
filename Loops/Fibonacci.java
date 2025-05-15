package Loops;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 20;
        int a = 0, b = 1;

        // Fibonacci series using for loop
        System.out.print("Fibonacci Series up to " + num + " digits : ");
        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("");

        // Fibonacci series using while loop
        int pre = 0, current = 1;
        System.out.print("Fibonacci Series up to " + num + ": ");
        System.out.print(pre + " "); // Print the first Fibonacci number (0)

        while (current <= num) {
            System.out.print(current + " ");
            int next = pre + current;
            pre = current;
            current = next;
        }
    }
}
