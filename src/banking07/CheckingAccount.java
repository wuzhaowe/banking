package banking07;

public class CheckingAccount extends Account{
	double overdraftProtection ;

	
	public CheckingAccount(double balance){
		super(balance);
	}
	
	
	public CheckingAccount(double overdraftProtection,double balance) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}
	
	public void withdraw(double amt) throws OverdraftException{
		
		if(balance > amt){
			balance -=amt;
			
		}else if(amt <= balance + overdraftProtection){
			balance = 0;
			overdraftProtection -= amt - balance;
			throw new OverdraftException("no overdraft protection", overdraftProtection);
		}else{
			double deficit = amt - balance - overdraftProtection;
			throw new OverdraftException("Insufficient funds for overdraft protection", deficit);
		}
		
		
	}
	

}
