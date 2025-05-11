package Array;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 1, 3, 6, 2, 3, 2, 1, 6, 5, 8, 1, 1, 1};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
