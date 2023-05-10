/**
 * 
 */
package practicing;

/**
 * @author Administrator
 *
 */





public class Arraysortwithk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Sharath";
		
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
