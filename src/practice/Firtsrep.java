/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Firtsrep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		char freq = 0;
		int flag=0;
		for(int i=0;i<str.length();i++) {
			freq=str.charAt(i);
			for(int j=i+1;j<str.length();j++) {System.out.println(freq+"=="+str.charAt(j));
				if(freq==(str.charAt(j))){
					flag=1;
					break;
				}}
				if(flag==1) {
					break;
				}
			
		}
		System.out.println(freq);

	}

}
