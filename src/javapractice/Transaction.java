/**
 * 
 */
package javapractice;

/**
 * @author Administrator
 *
 */
public class Transaction {
	
	private String productname;
	private String type;
	private double amount;
	public Transaction(String productname, String type, double amount) {
		super();
		this.productname = productname;
		this.type = type;
		this.amount = amount;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
