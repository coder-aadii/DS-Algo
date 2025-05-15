package Miscellaneous;

public class Q_47_SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 13, b = -25;
        // int a = 44, b = 10;
        // Goal => a = 25, b = 13

        a = a + b;
        b = a - b;
        a = a - b;

        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
