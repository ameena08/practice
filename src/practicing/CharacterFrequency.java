/**
 * 
 */
package practicing;

/**
 * @author Administrator
 *
 */
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "abcdab";
        char[] charArray = str.toCharArray();
        
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : charArray) {
//            	if (frequencyMap.containsKey(c)) {
//            	int count=frequencyMap.get(c);
//            	
//            	frequencyMap.put(c, count+1);
//            }  	
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);        
//            else {
//            	
//            	frequencyMap.put(c, 1);   
//         
//            }
            }
        
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
