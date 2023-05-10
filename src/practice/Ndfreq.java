/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Ndfreq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
				
		int largecount=0;
				for(int i=0;i<str.length();i++) {
					char largest=str.charAt(i);
					int count=0;
					

					
					for(int j=i+1;j<str.length();j++) {
						if(str.charAt(j)==largest) {
							count++;
							
						}
					
				
				
							if(count>largecount) {
								largecount=count;
								break;
								
							}		
							System.out.println(largest);
							
				}
					
							 
	}
}
}

				
							
								
				
				