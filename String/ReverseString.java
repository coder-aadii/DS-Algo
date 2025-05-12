package String;

// import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Indian"; //Immutable
        char[] arr = str.toCharArray(); // char[] arr = {"I", "n", "d", "i", "a", "n"} Muttable
        int start = 0, end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        String reversed = new String(arr);
        System.out.println("The reversed string is: " + reversed);
        // System.out.println(Arrays.toString(arr));
    }
}
