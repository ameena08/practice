/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.next();
		String n=s.toLowerCase();
		String rev="";
		int count=0;
		for(int i=n.length()-1;i>=0;i--) {
			rev=rev+n.charAt(i);
		}
		System.out.println(rev);
		
		for(int i=0;i<n.length()-1;i++) {
			if(n.charAt(i)==rev.charAt(i)) {
				 count = count+1;
			}
}
		if(count==n.length()-1) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}


