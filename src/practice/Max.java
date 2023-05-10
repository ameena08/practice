/**
 * 
 */
package practice;

/**
 * @author Administrator
 *
 */
public class Max {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,15,3,9,1,7};
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]>max) {
				max=arr[i+1];
			}
		}
		System.out.println(max);
		}

	}


