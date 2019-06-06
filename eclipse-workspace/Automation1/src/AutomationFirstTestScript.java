import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AutomationFirstTestScript {
	
	WebDriver driver;
	
//	public static void main(String[] args) 
	
	@BeforeMethod
	public void setUP(){ 
		
		System.setProperty("webdriver.chrome.driver","/home/claritus/Downloads/chromedriver");
		driver= new ChromeDriver();
		
//		System.setProperty("webdriver.firefox.marionette", "/home/claritus/Downloads/geckodriver");
//		WebDriver driver= new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	
		driver.get("https://www.google.com");
		
	}
		
		@Test(priority = 2)
		public void fetchAllLinks() {
			
		
	
    	List<WebElement> linkList= driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links=" +linkList.size());
		
		for(int i=1; i<=linkList.size(); i++) {
			
			String linkText= linkList.get(i).getText();
			
			System.out.println(linkText);
		}
		
		}
		
		@Test(priority = 1)
		public void countAllImages() {
			List<WebElement> imgList= driver.findElements(By.tagName("img"));
			System.out.println("Total number of img= "+imgList);
			
//			for(int i=1; i<=imgList.size();i++) {
//				String imgText = imgList.get(i).getText();
//				System.out.println("Here all img text "+imgText);
//			}
			
			driver.quit();
			
		}
		
		
		
		 
	
	
	}

