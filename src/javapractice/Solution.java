/**
 * 
 */
package javapractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Transaction> transaction=new ArrayList<>();
		transaction.add(new Transaction("Phone", "buy", 20000.0));
		transaction.add(new Transaction("Phone", "sell", 25000.0));
		transaction.add(new Transaction("Watch", "sell", 1000.0));
		transaction.add(new Transaction("Watch", "buy", 900.0));
		transaction.add(new Transaction("Laptop", "sell", 70000.0));
		transaction.add(new Transaction("Laptop", "buy", 60000.0));
		
		
		double selli=0.0;
		double buyi=0.0;
		
		
		
		List<Transaction> buy=transaction.stream().filter(i->i.getType().equals("buy")).toList();
		List<Transaction> sell=transaction.stream().filter(i->i.getType().equals("sell")).toList();
		
		
		for(Transaction t:buy) {
			buyi+=t.getAmount();
			
			
		}
//		System.out.print(profit+" ");
		
		for(Transaction t:sell) {
			selli+=t.getAmount();
			
		}
//		System.out.println(loss);
		
		if(selli-buyi>=0) {
			System.out.println("Profit is  : "+(selli-buyi));
		}
		else {
			System.out.println("Loss is  : " +(buyi-selli));
		}
		
		
		
		
		
		
		
		
	}

}
