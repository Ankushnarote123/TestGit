package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	    private static Properties prop;

	    public static void loadConfig() {
	       
	    	try {
	            InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");

	            prop = new Properties();
	            prop.load(input);
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }
	    
	    public static String getProperty(String key) {
	        return prop.getProperty(key);
	    }
	}


