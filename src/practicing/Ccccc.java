/**
 * 
 */
package practicing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 *
 */
import java.util.*;

public class Ccccc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6);
        Integer mostFrequentElement = findMostFrequentElement(list);
        System.out.println("Most frequent element: " + mostFrequentElement);
    }

    public static Integer findMostFrequentElement(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty.");
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        Integer mostFrequentElement = null;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        return mostFrequentElement;
    }
}
