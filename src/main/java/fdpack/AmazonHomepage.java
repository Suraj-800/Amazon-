package fdpack;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resources.Base;



public class AmazonHomepage extends Base{
	
	// Import the required modules
	
	
	   // Declare a WebDriver instance
	  private WebDriver driver;
	  
	// Create a constructor that will initialize the driver
		  public AmazonHomepage(WebDriver driver) {
		    this.driver = driver;
		  }
	  
	  
	  // Declare the web elements with @Find by method 
	  
	  @FindBy(xpath=("//span[text()='Analogue']"))
	  By displayFilter;
	  
	  @FindBy(xpath=("//span[text()='Leather'"))
	  By brandsMaterialFilter;
	  
	  @FindBy(xpath=("//span[text()='Titan']"))
	  By brandFilter;
	  
	  @FindBy(xpath=("//span[text()='25% Off or more']"))
	  By discountFilter;
	  
	  @FindBy(xpath=("\"//div[@data-component-type='s-search-result']"))
	  By resultsList;
	   
	  // Define a method that will click on the display filter
	  
	  public void clickDisplayFilter() {
	    driver.findElement(displayFilter).click();
	  }
	  
	  // Define a method that will click on the brands material filter
	  
	  public void clickBrandsMaterialFilter() {
	    driver.findElement(brandsMaterialFilter).click();
	  }
	  
	  // Define a method that will click on the brand filter
	  
	  public void clickBrandFilter() {
	    driver.findElement(brandFilter).click();
	  }
	  
	  // Define a method that will click on the discount filter
	 
	  public void clickDiscountFilter() {
	    driver.findElement(discountFilter).click();
	  }
	  
	  // Define a method that will print the title and price of the fifth element from the search results
	  
	  public void printFifthElement() {
	    List<WebElement> elements = driver.findElements(resultsList);
	    WebElement fifthElement = elements.get(4);
	    String title = fifthElement.findElement(By.xpath(".//h2/a/span")).getText();
	    String price = fifthElement.findElement(By.xpath(".//span[@class='a-price-whole']")).getText();
	    System.out.println("Title: " + title);
	    System.out.println("Price: " + price);
	  }

	
	
	}
	

	
	


