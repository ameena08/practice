/**
 * 
 */
package practicing;

/**
 * @author Administrator
 *
 */
import java.util.*;

public class MostFrequent {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
        String mostFrequentElement = findMostFrequentElement(list);
        System.out.println("Most frequent element: " + mostFrequentElement);
    }

    public static String findMostFrequentElement(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty.");
        }

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        String mostFrequentElement = null;
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        return mostFrequentElement;
    }
}
