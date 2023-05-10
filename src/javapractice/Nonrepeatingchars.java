/**
 * 
 */
package javapractice;

/**
 * @author Administrator
 *
 */
public class Nonrepeatingchars {

	/**
	 * @param args
	 */
	
	
	// program to find non repeating characters
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ameena";
		String str=s.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					
				}
			}
			if(count==1) {
				
				System.out.println(str.charAt(i));
			}
			
			count=0;
		
		}
		
	}

}
