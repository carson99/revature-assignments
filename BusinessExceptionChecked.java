package fourClass;

import java.io.FileInputStream;

public class BusinessExceptionChecked {
	
	
	public boolean isValidDLNumber(int license) throws InvalidDLNumber {
		 if (license<1000000) {
			 throw new InvalidDLNumber("You have not entered enough digits.");
		 }
		 if (license>9999999) {
			 throw new InvalidDLNumber("You have entered too many digits.");
		 }
		 return true;
	}

}
