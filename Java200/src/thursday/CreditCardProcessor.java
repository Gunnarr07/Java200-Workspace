package thursday;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Credit Card Processor
 * 
 * @author student
 *
 */
public class CreditCardProcessor {
	
	public void divertErrorsToFile(String fileName) {
		try {
			System.setOut(new PrintStream(new File(fileName)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Check Minimum Length.
	 * 
	 * @param cc
	 * @throws CreditCardException 
	 */
	private void validate(String cc) throws CreditCardException {
		if(cc.length() != 16) {
//			CreditCardException cce = new CreditCardException("Length not 16");
//			cce.setCreditCardNumber(cc);
//			throw cce;
			throw new CreditCardException("Length not 16", cc);
		}
	}
	
	public static void main(String[] args) {
		// Setup
		CreditCardProcessor ccp = new CreditCardProcessor();
		
		// Get the Credit Card.
		String cc = "1234567890123456";
		String ccBad = "123456789";
		
		// Validate the Credit Card.
		// Then send process it.
		try {
			ccp.validate(ccBad);
		} catch (CreditCardException e) {
			System.err.println(e);
		}
		System.out.println("Program ends.");
	}
}
