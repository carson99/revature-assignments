package dayTwoHomework;

import java.util.Scanner;
import java.util.Arrays;


public class PrimeArray {

	public static void main(String[] args) { //Should this be Array instead of String?
		
		/*String input1 = sc.next();
		String input2 = sc.nextLine();
		Integer input3 = sc.nextInt(); */
		
		int b=0;
		
		Scanner a=new Scanner(System.in);
		System.out.println("Please enter length of array.");
		
		b = a.nextInt();
		int c[] = new int[b];
		System.out.println("Please enter values in array.");
		
		
	
		for (int i=0; i<b; i++) {
			c[i] = a.nextInt();
			if(isPrime(i)) {
				System.out.println(i);
			}
			
			
			//numArray[i]= thisNum;
			
		}
		
		//System.out.println(Arrays.toString(numArray));
		//sc.close();

	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
//