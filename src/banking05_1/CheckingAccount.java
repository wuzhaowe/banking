package banking05_1;

public class CheckingAccount extends Account{
	double overdraftProtection ;

	
	public CheckingAccount(double balance){
		super(balance);
	}
	
	
	public CheckingAccount(double overdraftProtection,double balance) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}
	
	public boolean withdraw(double amt){
		
		if(balance > amt){
			balance -=amt;
			return true;
		}else if(amt <= balance + overdraftProtection){
			balance = 0;
			overdraftProtection -= amt - balance;
			return true;
		}else{
			return false;
		}
		
		
	}
	

}
