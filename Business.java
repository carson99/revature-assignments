package fourClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Business {
	
	public void openFile(String fileName) throws FileNotFoundException {
		FileOutputStream fos=new FileOutputStream(fileName);
		
	}

}
