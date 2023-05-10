/**
 * 
 */
package javapractice;

import java.util.Arrays;

/**
 * @author Administrator
 *
 */


import java.util.*;
public class IndexofUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list=Arrays.asList("car","bike","car","bike","scooter");
		Map<String,Integer>map=new HashMap<>();
		for(String l:list) {
			System.out.println(l);
			for(int i=0;i<l.length();i++) {
				System.out.println(l.charAt(i));
			}
			
			
			
			map.put(l, map.getOrDefault(l, 0)+1);
		}
		for(Map.Entry<String, Integer>entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(list.indexOf(entry.getKey()));
			}
		}
		
		
		
	}

}
