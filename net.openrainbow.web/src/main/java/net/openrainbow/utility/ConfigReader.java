package net.openrainbow.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;
	 private final String propertyFilePath= "src/main/resources/rainbow.properties";
	 
	 
	 public ConfigReader(){
	 BufferedReader reader;
	 try {
	 reader = new BufferedReader(new FileReader(propertyFilePath));
	 properties = new Properties();
	 try {
	 properties.load(reader);
	 reader.close();
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	 } catch (FileNotFoundException e) {
	 e.printStackTrace();
	 throw new RuntimeException("Configuration properties not found at " + propertyFilePath);
	 } 
	 }
	 public String getWebDriver() {
		 String webDriver = properties.getProperty("WebDriver");
		 if(webDriver != null) return webDriver;
		 else throw new RuntimeException("webDriver not specified in the app.properties file.");
	 }
	 public String getChromeDriver() {
		 String chromeDriver = properties.getProperty("chromeDriver");
		 if(chromeDriver != null) return chromeDriver;
		 else throw new RuntimeException("chromeDriver not specified in the app.properties file.");
	 }

	 public String getUrl() {
		 String url = properties.getProperty("url");
		 if(url != null) return url;
		 else throw new RuntimeException("url not specified in the Configuration.properties file.");
		 }
	 public String getUsername() {
		 String username = properties.getProperty("username");
		 if(username != null) return username;
		 else throw new RuntimeException("username not specified in the rainbow.properties file.");
		 }
	 public String getPassword() {
		 String password1 = properties.getProperty("password");
		 if(password1 != null) return password1;
		 else throw new RuntimeException("password not specified in the rainbow.properties file.");
		 }
}
