/**
 * 
 */
package javapractice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */


//program to find the longest non repeating substring



public class Longestnonrepsubstrg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pwwerrose";
		List<Character>list=new ArrayList<>();
		int count=0;
		int max=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(!list.contains(str.charAt(j))) {
					list.add(str.charAt(j));
					count++;
					max=Math.max(max, count);
				}
				else {
					count=0;
					list.clear();
					break;
				}	
			}
		}
		System.out.println(max);
	}
}
