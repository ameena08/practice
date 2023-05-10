/**
 * 
 */
package practice;

/**
 * @author Administrator
 *
 */
public class Count5 {
	public static void main(String args[]) {

	int count = 0;

	 

	for (int i = 1; i < 100; i++) {
	
		String s = String.valueOf(i);
	
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == '5') {
				count++;
			}
		}
	}

	System.out.println(count);

}
}
