/**
 * 
 */
package practice;

/**
 * @author Administrator
 *
 */
public class weirdsum {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[] = {1,2,3,4,5};
//			int sum=0;
			
			for(int i=0;i<arr.length;i++) {
				int sum=0;
				int n=arr[i];
				for(int j=0;j<arr.length;j++) {
				if(arr[j]!=n) {
					sum = sum+arr[j];
					
				}
				}
				System.out.println("Weird sum : " +sum);
//				sum=0;
				
			}
}
}
