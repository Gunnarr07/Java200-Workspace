package thursday;

import java.util.Date;

/**
 * Credit Card Exception
 * 
 * @author student
 *
 */
public class CreditCardException extends Exception {
	private String creditCardNumber;

	public CreditCardException(String message) {
		super(message);
	}
	
	public CreditCardException(String message, String creditCardNumber) {
		super(message);
		this.creditCardNumber = creditCardNumber;
	}
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public String toString() {
		return String.format(
				"Message: %s\n" +
				"Class: %s\n" +
				"Date: %tD\n" +
				"Time: %<tT\n" +
				"Credit Card: %s",
				this.getMessage(), 
				this.getClass().toString(),
				new Date(),
				this.getCreditCardNumber());
		
	}
}
