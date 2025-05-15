package Loops;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        int number = 12344321;
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        if (original == reversed)
            System.out.println("Given number is a Palindrome.");
        else
            System.out.println("Given number is not a palindrome.");
    }
}
