package banking07;

public class Account {
	protected double balance;
	
	public Account(){
		
	}
	
	public Account(double init_balance){
		this.balance = init_balance;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public boolean deposit(double amt) {
		this.balance += amt;
		return true;

	}
	public void withdraw(double amt) throws OverdraftException{
		if(this.balance >= amt){
			this.balance -= amt;
				
		}else{
			double deficit = amt - this.balance;
			throw new OverdraftException("资金不足",deficit);
		}
	}
	

}
