package banking04;

public class Bank {
	private Customer[] customers;
	private int numberCustomer = 0;
	
	public Bank(){
		this.customers = new Customer[5];
		
	}
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
	

}
