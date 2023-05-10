/**
 * 
 */
package practicing;

/**
 * @author Administrator
 *
 */
import java.util.*;

public class MostFrequentElement {
    public static <T> T findMostFrequent(List<T> list) {
        Map<T, Integer> frequencyMap = new HashMap<>();

        for (T element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        T mostFrequentElement = null;
        int maxFrequency = 0;

        for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentElement = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostFrequentElement;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        String mostFrequent = findMostFrequent(list);

        System.out.println("Most frequent element: " + mostFrequent);
    }
}

