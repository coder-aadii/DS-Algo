package String;

public class ToggleCase {
    public static void main(String[] args) {
        String str = "Ujjain Is A City Of GOD!";
        StringBuilder result = new StringBuilder();

        // In Java:
        // 'A' to 'Z' → ASCII values 65 to 90
        // 'a' to 'z' → ASCII values 97 to 122
        // The difference between 'a' and 'A' is 32
        // So if we do A+32 = a

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase
                result.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase
                result.append((char) (ch - 32));
            } else {
                // Keep other characters unchanged
                result.append(ch);
            }
        }

        System.out.println("Toggled string: " + result.toString());
    }
}
