package Patterns;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int num = 6;

        for (int i = 1; i <= num; i++) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
