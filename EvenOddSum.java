package dayTwoHomework;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int oddsum=0;
		int evensum=0;
		
		for(int i=1, j=2; i<=100 && j<=100; i++, j++) {
			if(i%2==1 && j%2==0) {
				System.out.println("i = " + i + " j = " + j);
				oddsum=oddsum+i;
				evensum=evensum+j;
				
			}
		}System.out.println(oddsum + " " + evensum);
		
		if (evensum > oddsum) {
			System.out.println("The even sum is larger.");
		}else {
			System.out.println("The odd sum is larger.");
		}

	}

}
