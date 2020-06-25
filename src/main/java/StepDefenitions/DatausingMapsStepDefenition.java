package StepDefenitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DatausingMapsStepDefenition {
	WebDriver driver;
	
	@Given("^user is already on CRM Login Page$")
	public void user_is_already_on_CRM_Login_Page() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		 driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	        driver.manage().deleteAllCookies();
	        driver.get("https://ui.freecrm.com/");
	   
	}

	@When("^the title of login page is Free CRM$")
	public void the_title_of_login_page_is_Free_CRM()  {
		
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
	   
	}

	@Then("^user enters valid username and password$")
	public void user_enters_valid_username_and_password(DataTable login)  {
		
		for(Map<String, String> logincred : login.asMaps(String.class, String.class)) {
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(logincred.get("username"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(logincred.get("password"));
			
		}
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		
		driver.findElement(By.xpath("//div[@class='right menu']//span[contains(text(),'sudheeri kumar')]")).isDisplayed();
	   
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page()  {
		
		driver.findElement(By.xpath("//div[@id='main-nav']//span[text()='Deals']")).click();
	    
	}
	
	
	@Then("^click on the new button$")
	public void click_on_the_new_button() {
		
		driver.findElement(By.xpath("//button[@class='ui linkedin button']//i[@class='edit icon']")).click();
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable deal)  {
		
		for(Map<String, String> dealsdata : deal.asMaps(String.class, String.class)) {
			
			driver.findElement(By.xpath("//input[@name='title']")).sendKeys(dealsdata.get("title"));
			driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(dealsdata.get("amount"));
			driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(dealsdata.get("probability"));
			driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(dealsdata.get("commission"));
			
			driver.findElement(By.xpath("//button[@class='ui linkedin button']//i[@class='save icon']")).click();
			
			driver.findElement(By.xpath("//a[@href='/deals']")).click();
			
			driver.findElement(By.xpath("//button[@class='ui linkedin button']//i[@class='edit icon']")).click();
			
		}
		
		 
	}
	
	@Then("^click on save button$")
	public void click_on_save_button() {
		
		driver.findElement(By.xpath("//button[@class='ui linkedin button']//i[@class='save icon']")).click();
	}
	
//	@Then("^user moves to new deal page1$")
//	public void user_moves_to_new_deal_page1()  {
//		
//		driver.findElement(By.xpath("//div[@id='main-nav']//span[text()='Deals']")).click();
//	    
//	}
//	
//	
//	@Then("^click on the new button1$")
//	public void click_on_the_new_button1() {
//		
//		driver.findElement(By.xpath("//button[@class='ui linkedin button']//i[@class='edit icon']")).click();
//	}

		@Then("^Close the browser1$")
		public void Close_the_browser1() {
			driver.quit();
		}
}
