package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData 
{
	public static void main(String[] args) throws IOException 
	{
	    
		FileInputStream fis = new FileInputStream("./data/config.properties");//to provide the path of property
		
		Properties prop = new Properties();//to read the data
		prop.load(fis);//use to read the data
		
		String data = prop.getProperty("Password");
		System.out.println(data);
	}
}
