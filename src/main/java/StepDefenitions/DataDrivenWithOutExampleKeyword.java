package StepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataDrivenWithOutExampleKeyword {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page without$")
	public void user_is_already_on_Login_Page_without() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		 driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	        driver.manage().deleteAllCookies();
	        driver.get("https://www.facebook.com/");
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_details_and(String username, String password)  {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	  
	}

	@Then("^Close the browsers$")
	public void close_the_browsers()  {
		driver.quit();
	    
	}

}
