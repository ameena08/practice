/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Javaindex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Enter the index");
		int n=sc.nextInt();
			char c=str.charAt(n);
			System.out.println(c);
		}

}
					


