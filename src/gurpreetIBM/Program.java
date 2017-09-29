package gurpreetIBM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String [] args) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "src/SeleniumDemo/chromeDriver/chromedriver");
		String testUrl = "http://automationpractice.com/index.php";
		
	
		WebDriver driver = new ChromeDriver();
		
		System.out.println("\n TC01 - Search with empty field and clicking the button to search");
		
		driver.get(testUrl);
		
		System.out.println("Running search on: " + testUrl);
		
		//Target submit by name and click to run search.
		driver.findElement(By.name("submit_search")).click();
		
		TimeUnit.SECONDS.sleep(5);
		
		String returnedUrl = driver.getCurrentUrl();
		
		System.out.println("Returned URL: " + returnedUrl);
		
		//Find number of returned results
		
		WebElement resultCountEl = driver.findElement(By.className("heading-counter"));
		WebElement resultAlertEl = driver.findElement(By.className("alert-warning"));
		
		String resultCount = resultCountEl.getAttribute("innerText");
		String resultAlert = resultAlertEl.getAttribute("innerText");
		
		System.out.println("Number of Results: " + resultCount);
		System.out.println("Alert Text returned: " + resultAlert);
				
		//turn off chrome.
		TimeUnit.SECONDS.sleep(5);
		driver.quit();
		
		
		
		System.out.println("\n TC02 - search with empty field and hitting return key on keyboard"); 
		
		driver = new ChromeDriver();
		driver.get(testUrl);

		System.out.println("Running search on: " + testUrl);
		
		//Target submit by name and hit the return keyboard to run search.
		driver.findElement(By.name("submit_search")).sendKeys(Keys.RETURN);
		
		TimeUnit.SECONDS.sleep(5);
		
		returnedUrl = driver.getCurrentUrl();
		
		System.out.println("Returned URL: " + returnedUrl);
		
		//Find number of returned results
		
		resultCountEl = driver.findElement(By.className("heading-counter"));
		resultAlertEl = driver.findElement(By.className("alert-warning"));
		
		resultCount = resultCountEl.getAttribute("innerText");
		resultAlert = resultAlertEl.getAttribute("innerText");
		
		System.out.println("Number of Results: " + resultCount);
		System.out.println("Alert Text returned: " + resultAlert);
		
		//turn off chrome.
		TimeUnit.SECONDS.sleep(5);
		driver.quit();
		
		
		System.out.println("\n TC03 - search with a search term with no items");
		
		driver = new ChromeDriver();
		driver.get(testUrl);

		System.out.println("Running search on: " + testUrl);
		
		String searchQuery = "Jeans";
				
		//Target submit by name and hit the return keyboard to run search.
		driver.findElement(By.name("search_query")).sendKeys(searchQuery);
		driver.findElement(By.name("submit_search")).sendKeys(Keys.RETURN);

		System.out.println("Running search with query: " + searchQuery);
		
		TimeUnit.SECONDS.sleep(5);
				
		returnedUrl = driver.getCurrentUrl();
				
		System.out.println("Returned URL: " + returnedUrl);
				
		//Find number of returned results
				
		resultCountEl = driver.findElement(By.className("heading-counter"));
		resultAlertEl = driver.findElement(By.className("alert-warning"));
				
		resultCount = resultCountEl.getAttribute("innerText");
		resultAlert = resultAlertEl.getAttribute("innerText");
				
		System.out.println("Number of Results: " + resultCount);
		System.out.println("Alert Text returned: " + resultAlert);
				
		//turn off chrome.
		TimeUnit.SECONDS.sleep(5);
	    driver.quit();
	    
	    
	    System.out.println("\n TC04 - search with a search term with x number of items returned");
	    driver = new ChromeDriver();
	    driver.get(testUrl);

	    System.out.println("Running search on: " + testUrl);
	 		
	    searchQuery = "Dress";
	 				
	    //Target submit by name and hit the return keyboard to run search.
	    driver.findElement(By.name("search_query")).sendKeys(searchQuery);
	    driver.findElement(By.name("submit_search")).sendKeys(Keys.RETURN);

	    System.out.println("Running search with query: " + searchQuery);
	 		
	    TimeUnit.SECONDS.sleep(5);
	 				
	    returnedUrl = driver.getCurrentUrl();
	 				
	    System.out.println("Returned URL: " + returnedUrl);
	 				
	    //Find number of returned results
	 				
	    resultCountEl = driver.findElement(By.className("heading-counter"));
	    WebElement resultProductEl = driver.findElement(By.className("product-count"));
	 				
	    resultCount = resultCountEl.getAttribute("innerText");
	    String resultProduct = resultProductEl.getAttribute("innerText");
	 				
	    System.out.println("Number of Results: " + resultCount);
	    System.out.println("Number of Results returned: " + resultProduct);
	 				
	    //turn off chrome.
	    TimeUnit.SECONDS.sleep(5);
	    driver.quit();
    }
}


