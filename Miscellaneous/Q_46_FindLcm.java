package Miscellaneous;

public class Q_46_FindLcm {
    public static void main(String[] args) {
        int a = 29;
        int b = 4;
        int lcm = (a > b) ? a : b;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }

        System.out.printf("The Lowest common multiple of %d and %d is %d.\n", a, b, lcm);
    }
}
