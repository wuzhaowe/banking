package banking07;

public class Bank {
	private Customer[] customers;
	private int numberCustomer = 0;
	
	private Bank(){
		this.customers = new Customer[5];
		
	}
	private static Bank bank = new Bank();
	public void addCustomer(String f,String l){
		customers[numberCustomer] = new Customer(f, l);
		numberCustomer++;
	}
	public int getNumOfCustomers(){
		return this.numberCustomer;
	}
	public Customer getCustomer(int index){
		return customers[index];
	}
	
	public static Bank getBanking(){
		return bank;
	}

}
