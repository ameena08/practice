/**
 * 
 */
package practicing;

/**
 * @author Administrator
 *
 */
import java.util.*;

public class Longest {
	public static void main(String[] args) {
		String ss = "pwwed";
		List<Character> l2 = new ArrayList<>();
		int count = 0, max = 0;
		for (int i = 0; i < ss.length(); i++) {
			for (int j = i; j < ss.length(); j++) {
				if (!l2.contains(ss.charAt(j))) {
					l2.add(ss.charAt(j));
					count++;
					max = Math.max(max, count);

				} else {
					count = 0;
					l2.clear();
					break;
				}
			}
		}

		System.out.println(max);

	}
}