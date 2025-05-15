package Loops;

import java.util.Scanner;

public class NumberDivisibleBy3and5 {
    public static void main(String[] args) {

        System.out.print("Enter a number up to which you want numbers divisible by 3 and 5: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean found = false;

        if (num < 15) {
            System.out.println("There is not a single number divisible by 3 and 5 from 1 to " + num);
        } else {
            for (int i = 15; i <= num; i += 15) {
                System.out.printf("%d is divisible by 3 and 5.\n", i);
                found = true;
            }
        }

        if (!found && num >= 1) {
            System.out.println("There is not a single number divisible by 3 and 5 from 1 to " + num);
        }
    }
}
