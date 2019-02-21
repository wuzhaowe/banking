package banking02;

public class BankingTest {
	public static void main(String[] args) {
		Customer customer;
		Account account;
		
		customer = new Customer("Jane", "Smith");
		account = new Account(500);
		
		// Create an account that can has a 500.00 balance.
		System.out.println("Creating the customer Jane Smith.");
		// code
		customer.setAccount(account);
		
		System.out.println("Creating her account with a 500.00 balance.");
		// code
		account.withdraw(150);
		
		System.out.println("Withdraw 150.00");

		// code
		account.deposit(22.5);
		System.out.println("Deposit 22.50");
		// code
		account.withdraw(47.62);
		System.out.println("Withdraw 47.62");
		// code
		// Print out the final account balance
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName()
				+ "] has a balance of " + account.getBalance());
	}

}
