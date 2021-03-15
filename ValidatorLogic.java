package fourClass;

public class ValidatorLogic {
	
	
	public boolean isValidAge(int age) throws InvalidAgeException {
		
		if(age<=0) {
			throw new InvalidAgeException("Age cannot be zero or negative.");
			
		}
		
		if(age<18 || age>35) {
			throw new InvalidAgeException("Only users aged 18 to 35 allowed.");
		}
		
		return true;
	}

}
