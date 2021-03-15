package fourClass;

public class ValidatorMain {

	public static void main(String[] args) {
		
		ValidatorLogic v=new ValidatorLogic();
		try {
			if(v.isValidAge(14)) {
				System.out.println("Age validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
