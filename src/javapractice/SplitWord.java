/**
 * 
 */
package javapractice;

/**
 * @author Administrator
 *
 */
public class SplitWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello How are you";
		String[] a=s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
