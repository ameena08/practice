/**
 * 
 */
package practicing;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Increase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[3];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			Scanner sc=new Scanner(System.in);
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<arr.length-1;i++) {
			
		
			if(arr[arr.length-1]==9&&arr[arr.length-2]==9) {
				arr[arr.length-1]=0;
				arr[arr.length-2]=0;
				arr[arr.length-3]=arr[arr.length-3]+1;
			}
			
			else if(arr[arr.length-2]!=9 && arr[arr.length-1]==9 ) {
				arr[arr.length-2]=arr[arr.length-2]+1;
				arr[arr.length-1]=0;
			}
			
			
			
					

			else if((arr[arr.length-1]==0)||(arr[arr.length-1]==1)||(arr[arr.length-1]==2)||(arr[arr.length-1]==3)||
					(arr[arr.length-1]==4)||(arr[arr.length-1]==5)||(arr[arr.length-1]==6)
					||(arr[arr.length-1]==7)||(arr[arr.length-1]==8)) {
				
				arr[arr.length-1]=(arr[arr.length-1])+1;
				
			}
				
			}	
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}	
	}

}
