/**
 * 
 */
package practice;

/**
 * @author Administrator
 *
 */
public class Merging {

	/**
	 * @param args
	 */
	
		    public static void main(String[] args) {
		        int[] arr1 = {3, 7, 1, 9};
		        int[] arr2 = {5, 2, 8, 4};
		        int[] mergedArr = new int[arr1.length + arr2.length];

		        // merge the two arrays into one
		        int index = 0;
		        for (int i = 0; i < arr1.length; i++) {
		            mergedArr[index] = arr1[i];
		            index++;
		        }
		        for (int j = 0; j < arr2.length; j++) {
		            mergedArr[index] = arr2[j];
		            index++;
		        }

		        // sort the merged array in descending order
		        for (int i = 0; i < mergedArr.length ; i++) {
		            for (int j = i + 1; j < mergedArr.length; j++) {
		                if (mergedArr[i] < mergedArr[j]) {
		                    int temp = mergedArr[i];
		                    mergedArr[i] = mergedArr[j];
		                    mergedArr[j] = temp;
		                }
		            }
		        }

		        // print the sorted merged array
		        System.out.println("Sorted Merged Array in Descending Order:");
		        for (int i = 0; i < mergedArr.length; i++) {
		            System.out.print(mergedArr[i] + " ");
		        }
		    }
		
}
