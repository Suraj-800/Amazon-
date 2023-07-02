package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	 // Declare a WebDriver instance
	  public WebDriver driver;
	  
	  // Define a method that will run before each test class and create a Chrome driver instance
	  @BeforeClass
	  public void setup() {
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    driver = new ChromeDriver();
	  }
	  
	  // Define a method that will run after each test class and close the driver
	  @AfterClass
	  public void teardown() {
	    driver.close();
	  }
	
	
	

}
