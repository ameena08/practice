/**
 * 
 */
package javapractice;

/**
 * @author Administrator
 *
 */
public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix1= {{1,2,1},{2,2,4},{3,2,4}};
		int sum=0;
		int row=3;
		int column=3;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(i==j) {
					
					sum=sum+matrix1[i][j];
				}
				
				}
			if(i!=(row-1-i)) {
				sum+=matrix1[i][row-1-i];
			}
		}
		System.out.println(sum);
	}
}
	
		
		
