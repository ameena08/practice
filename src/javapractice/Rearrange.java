/**
 * 
 */
package javapractice;

/**
 * @author Administrator
 *
 */
public class Rearrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="codeleet";
		int[]arr= {4,5,6,7,0,1,2,3};
		char[] result = new char[s.length()];
		for (int i = 0; i < arr.length; i++) {
		result[arr[i]] = s.charAt(i);
		}
		System.out.println(result);	
	}
}
