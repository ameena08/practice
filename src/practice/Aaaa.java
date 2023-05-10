/**
 * 
 */
package practice;

/**
 * @author Administrator
 *
 */
public class Aaaa {

	/**
	 * @param args
	 */
	
			   public static void main(String[] args) {
			      String input = "this is a sample string";
			      String[] words = input.split(" ");
			      String result="";

			      for (int i = 0; i < words.length; i++) {
			         String word = words[i];
			         String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1)+" ";
			         result+=capitalizedWord;
			      }
			         System.out.print(result.trim());
			      }
			   }

			
