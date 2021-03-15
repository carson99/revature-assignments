package classWorkThree;

public class StrangeCase {

	public static void main(String[] args) {
		
		String s="so long and thanks for all the fish";
		
				
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();

		for (int i=0, j=0; i<ar.length, j=ar[i].length(); j++) {
			sb.append(Character.toUpperCase(ar[i].charAt(j)));//.append(ar[i].substring(1)).append(" ");
					
		}System.out.println(sb.toString().trim());

	}

}
