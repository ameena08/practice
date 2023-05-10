/**
 * 
 */
package javapractice;

import java.util.Arrays;

/**
 * @author Administrator
 *
 */

import java.util.*;
public class Prefix {

	/**
	 * @param args
	 */

	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("apple","appo","approz");
	        List<Integer>m=Arrays.asList(1,2,3,4);
	        Collections.sort(list);	     
	        System.out.println(list);
	        String s1=list.get(0);
	        String s3="";
	        String s2=list.get(list.size()-1);
	        for(int i=0;i<s1.length();i++) {
	        	if(s1.charAt(i)==s2.charAt(i)) {
	        		s3+=s1.charAt(i);
	        	}
	        	else {
//	        		System.out.println("there is no common prefix");
	        		break;
	        	}
	        }
	        System.out.println(s3);
	        
	    }
	    
}
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
//	       
//	        String first = list.get(0);
//	        for (int i = 0; i < first.length(); i++) {
//	            char c = first.charAt(i);
//	            for (String s : list) {
//	                if (i >= s.length() || s.charAt(i) != c) {
//	                    System.out.println(first.substring(0, i));
//	                    return; // Exit the method after printing the common prefix
//	                }
//	            }
//	        }
//	        System.out.println(first); // If all strings have the same prefix, print the entire first string
//	    }
//	}
	        
	        
	      