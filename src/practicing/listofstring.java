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
public class listofstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> s= Arrays.asList("Kochi","Trivandrum","Kochi","Kochi","Trivandrum");
	
		Map<String,Integer> b=new HashMap<>();
		for(String str:s) {
//			if(b.containsKey(str)) {
//				int count=b.get(str);
//				b.put(str, count+1);
//			}
//			else {
//				b.put(str, 1);
//			}
			
			b.put(str, b.getOrDefault(str, 0)+1);	
		}	
		for (Map.Entry<String, Integer> entry : b.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}
}
