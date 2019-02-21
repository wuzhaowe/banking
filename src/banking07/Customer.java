package banking07;

public class Customer {
	private String firstName;
	private String lasttName;
	private Account[] accounts;
	private int numOfAccount = 0;
	
	
	public Customer(String f,String l){
		this.firstName = f;
		this.lasttName = l;
		accounts = new Account[5];
		
	}
	
	public void addAccount(Account account){
		this.accounts[numOfAccount] = account;
		numOfAccount++;
	}
	public String getFirstName(){
		return this.firstName;
		
	}
	public String getLastName(){
		return this.lasttName;
	}
	public Account getAccount(int index){
		return this.accounts[index];
	}
//	public void setAccount(Account acct){
//		this.account = acct;
//
//		
//	}
	public int getNumOfAccounts(){
		return this.numOfAccount;
	}
	
	

}
