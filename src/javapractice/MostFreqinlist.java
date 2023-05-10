/**
 * 
 */
package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class MostFreqinlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list=Arrays.asList("Car","Bike","Car","Scooter","Bike","Car");
		Map<String,Integer>map=new HashMap<>();
//		List<String>ha=new ArrayList<>();
		
		int most=0;
		String moststring=null;
		for(String l:list) {
			
			map.put(l, map.getOrDefault(l, 0)+1);		
		}
		
		for(Map.Entry<String,Integer> entry: map.entrySet()){
			if(entry.getValue()>most) {
				
				most=entry.getValue();
				moststring=entry.getKey();
//				ha.add(moststring);
			}
			
		}
		
		System.out.println(list.indexOf(moststring));
		System.out.println(moststring);
//		System.out.println(list.lastIndexOf(moststring));
	
	}

}
