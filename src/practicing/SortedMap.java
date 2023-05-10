/**
 * 
 */
package practicing;

/**
 * @author Administrator
 *
 */
public class SortedMap {

public static boolean check(String s ,int i, int j) {

	while(i<j) {
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	
	return true;
}

public static String longs(String s) {
	int start=0;
	int max=0;
	for(int i=0;i<s.length();i++) {
		for(int j=i;j<s.length();j++) {
			//System.out.println(s.substring(i,j+1));
			if(check(s,i,j)) {
				if(max<=j-i+1) {
					max=j-i+1;
					start=i;
				}
			}

		}

	}return s.substring(start,start+max);
}

public static void main(String args[]) {
String s="cacbababde";
System.out.println(longs(s));
}
}

