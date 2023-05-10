/**
 * 
 */
package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,27);
		        
		        List<Integer> primeNumbers = numbers.stream()
		                                             .filter(n -> isPrime(n))
		                                             .collect(Collectors.toList());
		        
		        System.out.println(primeNumbers);
		    }
		    
		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false;
		        }
		        
		        for (int i = 2; i <= number/2; i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
		        
		        return true;
		    }
		


	}

