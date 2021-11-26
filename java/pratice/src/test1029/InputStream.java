package test1029;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStream {

	public static void main(String[] args) {	
		try {
			FileInputStream fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	

}
