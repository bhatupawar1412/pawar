package PracticeProblem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
//step 1
//project report right click kela and Untitled Text File select kela 
//step 2
// then control + s button press
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("Data.Properties");
		
		Properties prop =new Properties();
		
		prop.load(reader); //connected file-reader with properties
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("phoneNumber"));
		
	}
}
