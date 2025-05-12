package String;

public class StringIsPalindrome {
    public static void main(String[] args) {
        String str = "abcdcba";

        int start = 0, end = str.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("The given string is a palindrome.");
        else
            System.out.println("The given string is NOT a palindrome.");
    }
}
