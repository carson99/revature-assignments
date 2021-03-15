package fourClass;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		int res=0;
		
		try {
		res=x/y;
		String s=null;
		System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("We cannot divide by zero");
		}finally {
			System.out.println("result is : "+res);
		}
		
		System.out.println("Some other lines of  code");

	}

}
