/**
 * 
 */
package javapractice;

/**
 * @author Administrator
 *
 */
public class Oddevensum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ssstr="ashimb";
		
		String str=ssstr.toLowerCase();
		String newstr="";
		String ppstr="";
		int mid=(str.length()-1)/2;
		System.out.println(str.charAt(mid));
		
		
		if(str.length()%2!=0) {
			
			
			 newstr=str.substring(0,mid);
			ppstr=str.substring(mid+1,str.length());
			System.out.println(newstr);
			System.out.println(ppstr);
			
		}
		else {
			
			
			newstr=str.substring(0,mid+1);
			ppstr=str.substring(mid+1,str.length());
			System.out.println(newstr);
			System.out.println(ppstr);
		}
		
		int sum=0;
		int summ=0;
		
		for(int i=0;i<newstr.length();i++) {
			sum=sum + newstr.charAt(i)-'a'+1;
		}
		for(int i=0;i<ppstr.length();i++) {
			summ=summ + ppstr.charAt(i)-'a'+1;
		}
		
		if(sum==summ) {
			System.out.println("successfull");
		}
		else {
			System.out.println("Not successfull");
		}
		
	
	}

}
