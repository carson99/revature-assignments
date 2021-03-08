package fourClass;

public class BusinessExceptionUnchecked {
	

	public boolean isValidPassport(int pass) throws InvalidPassportNumber {
		 if (pass<1000000) {
			 throw new InvalidPassportNumber("You have not entered enough digits.");
		 }
		 if (pass>9999999) {
			 throw new InvalidPassportNumber("You have entered too many digits.");
		 }
		 return true;
	}

}
