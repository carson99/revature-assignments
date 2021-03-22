package classWorkThree;

import java.util.Scanner;

public class Vowels2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Type something");
		
		String s1=sc.nextLine();
		System.out.println("You typed : "+s1);
		
		int vowels=0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!='a' || s1.charAt(i)!='e' || s1.charAt(i)!='i' || s1.charAt(i)!='o' || s1.charAt(i)!='u' || s1.charAt(i)!='A' || s1.charAt(i)!='E' || s1.charAt(i)!='I' || s1.charAt(i)!='O' || s1.charAt(i)!='U') {

			System.out.println("Some vowel(s) absent");
		
		}

	}

}}
