
public class PalindromeTime {

	public static void main(String[] args) {
		for (int i=100; i<1000; i++) {
			printPals(i);
		// TODO Auto-generated method stub
			
	}
}

	public static void printPals(int num) {
		
		
		int hundreds = (num - (num%100))/100;
		int ones = (num%10);
		
		if (hundreds == ones) {
			System.out.println(num);
			
		} 

}
}
