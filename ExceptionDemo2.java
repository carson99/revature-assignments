package fourClass;

import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Business b=new Business();
		try {
			b.openFile("one.txt");
			System.out.println("File reading successful");
		} catch(FileNotFoundException e) {
			System.out.println(e);
			System.out.println("File unable to create");
		}

	}

}
