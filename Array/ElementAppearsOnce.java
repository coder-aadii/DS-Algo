package Array;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 1, 2, 18, 5, 100, 8, 6, 45, 23, 45, 5};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue()==1) {
                System.out.printf(entry.getKey() + "\t only appear once\n");
            }
        }

    }
}
