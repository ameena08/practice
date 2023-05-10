/**
 * 
 */
package javapractice;

/**
 * @author Administrator
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		String s=Integer.toString(n);
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);	
		}
		System.out.println(str);
	}
}
