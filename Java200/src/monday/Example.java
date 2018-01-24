package monday;

public class Example {
	private class Example2 {
		String message = "Hello world!";
		
		public String getMessage() {
			return message;
		}
	}
	
	private Example2 example = new Example2();
	
	public String getExampleMessage() {
		return example.getMessage();
	}
}
