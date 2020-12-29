package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Store {

	public static void main(String[] args) throws IOException {
	File propFile=new File("config//ProjectDetails.properties");
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream(propFile);
	prop.load(fis);
	
	
	
	String browserName=prop.getProperty("Browser") ;
	WebDriver driver = null;
	if(browserName.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}else if(browserName.equals("FireFox")){
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}else if(browserName.equals("IE")){
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	driver.get(prop.getProperty("URl"));

	}
}



