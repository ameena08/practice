/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Mult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		
		
		
		int arr[]=new int[n];
		System.out.println("Enter the elements  :  ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(arr[i]<arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		}
		for(int i=0;i<n;i++) {
			System.out.println("New Array is :  "+arr[i]);
		}
//			for(int i=0;i<3;i++) {
//				arr[i]=arr[i]*arr[i];
//				System.out.println("Product is :  "+arr[i]);
//			}
		
		int prod=1;
		for(int i=0;i<3;i++) {
			prod=prod*arr[i];
			
		}
		System.out.println("Product is  :"+prod);
		
	}

}
