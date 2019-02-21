package banking07;

public class OverdraftException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4953378421279029696L;
	private double deficit;

	public double getDeficit() {
		return deficit;
	}

	public OverdraftException(String message,double deficit) {
		super(message);
		this.deficit = deficit;
	}
	

}
