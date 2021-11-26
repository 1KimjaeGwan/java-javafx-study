package c3_map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("hi", "hello");
		prop.put("hi", 10);
		System.out.println(prop.get("hi"));
		
		prop.setProperty("key", "key value");
		System.out.println(prop.getProperty("key"));
		System.out.println(prop.getProperty("심현석","심현석 59점"));
		
		System.out.println("======================================");
		// 경고
		String path = PropertiesExam.class.getResource("db.properties").getPath();
		System.out.println(path);
		Properties prop2 = new Properties();
		try {
			prop2.load(new FileReader(path));
			System.out.println(prop2.getProperty("driver"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}




