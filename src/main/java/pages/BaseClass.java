package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClass {
	
	Properties prop;
	FileInputStream fis;
	public BaseClass() throws IOException
	{
		prop = new Properties();

		String path = System.getProperty("user.dir") + "\\config.properties";

		fis = new FileInputStream(path);

		prop.load(fis);
	}
	
//	Above constructor is used to create the object which is being used by page class as per the requirement.
	

}
