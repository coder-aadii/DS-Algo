package String;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Ujjain is a city of GOD!";
        int count = 0;
        char[] arr = str.toLowerCase().toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                count++;
        }
        System.out.printf("There are %d vowels in the given string.\n", count);
    }
}
