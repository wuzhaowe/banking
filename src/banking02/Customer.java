package banking02;

public class Customer {
	private String firstName;
	private String lasttName;
	private Account account;
	
	public Customer(String f,String l){
		this.lasttName = l;
		this.firstName = f;
	}
	public String getFirstName(){
		return this.firstName;
		
	}
	public String getLastName(){
		return this.lasttName;
	}
	public Account getAccount(){
		return this.account;
	}
	public void setAccount(Account acct){
		this.account = acct;
		
		
	}
	
	

}
