package cn.edu.bupt.springmvc.core.util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesValue {
	
	private static Properties properties = null;
	
	
	private PropertiesValue() throws IOException {
	}
	
	public static String getProperty(String key) {
		if (properties == null){
			properties = new Properties();
			try {
				properties.load(PropertiesValue.class.getResourceAsStream("/application.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return properties.getProperty(key);
	}
	

}
