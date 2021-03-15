package classWorkThree;

public class TitleCase {

	public static void main(String[] args) {
		String s="string is immutable and stringbuffer and stringbuilder is not";
		
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i=0; i<ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1));//.append(" ");
			
		}System.out.println(sb.toString().trim());

	}

}

//1. Take a sentence as input and convert all the last chars to upper case of every word.
//2. Take a sentence as input and for the word with odd length, convert the middle character to uppercase, and for even length, convert the first character to uppercase
//3. Take a sentence as input and print the word with maximum letters and also print the word with minimum letters.
