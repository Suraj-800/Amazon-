package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	WebDriver driver;
	@Test
	public void lauchbrowser() {
		
		
		 // Set up the Chrome driver
	    WebDriverManager.chromedriver().setup();
	    
	    // Create a WebDriver instance
	    WebDriver driver = new ChromeDriver();
	    
	    // Create a WebDriverWait instance
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    // ...
		
	   // Navigate to the Amazon website
	    driver.get("https://amazon.in");
	    
	    // Find the search box element
	    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	    
	    // Enter the search term "Wrist Watches"
	    searchBox.sendKeys("Wrist Watches");
	    
	    // Find the search button element
	    WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	    
	    // Click on the search button
	    searchButton.click();
	    
	    // ...
	    // Find the display filter element
	    WebElement displayFilter = driver.findElement(By.xpath("//span[text()='Display']"));
	    
	    // Click on the display filter
	    displayFilter.click();
	    
	    // Find the analogue option element
	    FluentWait<WebDriver> wait = null;
		WebElement analogueOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Analogue']")));
	    
	    // Click on the analogue option
	    analogueOption.click();
	    
	    // Find the brands material filter element
	    WebElement brandsMaterialFilter = driver.findElement(By.xpath("//span[text()='Brands Material']"));
	    
	    // Click on the brands material filter
	    brandsMaterialFilter.click();
	    
	    // Find the leather option element
	    WebElement leatherOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leather']")));
	    
	    // Click on the leather option
	    leatherOption.click();
	    
	    // Find the brand filter element
	    WebElement brandFilter = driver.findElement(By.xpath("//span[text()='Brand']"));
	    
	    // Click on the brand filter
	    brandFilter.click();
	    
	    // Find the titan option element
	    WebElement titanOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Titan']")));
	    
	    // Click on the titan option
	    titanOption.click();
	    
	    // Find the discount filter element
	    WebElement discountFilter = driver.findElement(By.xpath("//span[text()='Discount']"));
	    
	    // Click on the discount filter
	    discountFilter.click();
	    
	    // Find the 25% off or more option element
	    WebElement twentyFiveOffOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='25% Off or more']")));
	    
	    // Click on the 25% off or more option
	    twentyFiveOffOption.click();
	    
	 // Find the search result elements
	    List<WebElement> searchResults = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
	    
	    // Check if there are at least five elements
	    if (searchResults.size() >= 5) {
	      try {
	        // Get the fifth element
	        WebElement fifthElement = searchResults.get(4);
	        
	        // Get the title of the fifth element
	        String title = fifthElement.findElement(By.className("a-size-base-plus")).getText();
	        
	        // Get the price of the fifth element
	        String price = fifthElement.findElement(By.className("a-price-whole")).getText();
	        
	        // Get the rating of the fifth element
	        String rating = fifthElement.findElement(By.className("a-icon-alt")).getText();
	        
	        // Print the details of the fifth element
	        System.out.println("Title: " + title);
	        System.out.println("Price: " + price);
	        System.out.println("Rating: " + rating);
	      } catch (Exception e) {
	        // Handle any exceptions
	        System.out.println("Something went wrong: " + e.getMessage());
	      }
	    } else {
	      // Handle the case when there are less than five elements
	      System.out.println("Not enough search results found");
	    }
	    
	    // Close the driver
	    driver.quit();  // ...
	  }
	}
		
		

