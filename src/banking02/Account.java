package banking02;

public class Account {
	private double balance;
	
	public Account(double init_balance){
		this.balance = init_balance;
//		System.out.println("Creating an account with a " + this.balance + "balance");
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void deposit(double amt){
		this.balance += amt;
//		System.out.println("Deposit " + amt);
	}
	public void withdraw(double amt){
		this.balance -= amt;
//		System.out.println("withdraw " + amt);
	}
	

}
