/**
 * 
 */
package javapractice;

import java.util.*;
//import java.util.Map;

/**
 * @author Administrator
 *
 */
public class Characterfreq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="Ameena";
//		String str=s.toLowerCase();
//		int count=0;
//		for(int i=0;i<str.length();i++) {
//			for(int j=0;j<str.length();j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					count++;
//				}
//			}
//			System.out.println("Character"+" " +str.charAt(i)+" "+"occurs"+" "+count+" "+"times");
//			count=0;
//		}
//
//	}
	
		//using map
		
		String sr="Ameena";
		String str=sr.toLowerCase();
		Map<Character,Integer>map=new HashMap<>();
		
		char[] ch=str.toCharArray();
		for(char c:ch) {
				map.put(c, map.getOrDefault(c,0) + 1);
		}
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
}
}
