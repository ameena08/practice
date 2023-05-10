/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Freq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			for(int j=i+1;j<str.length();j++) {
				if(ch==(str.charAt(j))){
					count++;
				}
			}
				if(count>0) {
					break;
				}
			}
		
		System.out.println(count);
	}
}
					
			