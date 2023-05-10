/**
 * 
 */
package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
import java.util.*;



public class Word {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);



// Get input sentence from the user
System.out.println("Enter a sentence:");
String sentence = scanner.nextLine();



// Split sentence into words
 String[] words = sentence.split("\\s+");



 // Count occurrences of each word in the sentence
 Map<String, Integer> wordCount = new HashMap<>();
for (String word : words) {
if (wordCount.containsKey(word)) {
 wordCount.put(word, wordCount.get(word) + 1);
} else {
wordCount.put(word, 1);
 }
 }



 // Find the most frequently occurring word in the sentence
 int maxCount = 0;
String mostFrequentWord = "";
for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
 if (entry.getValue() > maxCount) {
maxCount = entry.getValue();
 mostFrequentWord = entry.getKey();
}
}



 // Remove the most frequently occurring word from the sentence
sentence = sentence.replaceAll("\\b" + mostFrequentWord + "\\b", "");



 // Print the updated sentence
System.out.println("Updated sentence: " + sentence);
}
}

