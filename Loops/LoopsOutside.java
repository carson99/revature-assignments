
public class LoopsOutside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=20;
		if (x>10) {
			System.out.println("Yup, greater than 10");
		}else {
			System.out.println("Nope, less than 10");
		}
		
		for (int a = 5; a<=15; a++) {
			System.out.println("a = "+a);
		}
		
		System.out.println("Print the five times table");
		for (int i=5; i<=60; i++) {
			if (i%5==0) {
				System.out.println(i + " ");
			}
		}
		int j=12;
		while (j!=0) {
			System.out.println(j);
			j--;
		}
		
		x=30;
				
		do {
			System.out.println("I got it if this prints once");
		} while (x!=30);

	}

}
