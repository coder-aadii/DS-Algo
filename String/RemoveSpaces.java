package String;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Ujjain is a city of GOD!";

        // String result = str.replace(" ", "");

        // System.out.println("String without spaces: " + result);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                result.append(ch);
            }
        }

        System.out.println("String without spaces: " + result.toString());
    }
}
