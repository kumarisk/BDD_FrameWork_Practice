package StepDefenitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataTableStepDefenition {
	
	WebDriver driver;
	
	@Given("^user is on login/sign up page$")
	public void user_is_on_login_sign_up_page() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		 driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	        driver.manage().deleteAllCookies();
	        driver.get("https://www.facebook.com/");
	        
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable logindata)  {
		List<List<String>> data = logindata.raw();
		driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("pass")).sendKeys(data.get(0).get(1));
		
	   
	}

//	@Then("^usre clic on login$")
//	public void usre_clic_on_login()  {
//	   
//	}

	@Then("^user enters firstname lastname email and password$")
	public void user_enters_firstname_lastname_email_and_password(DataTable signupdata)   {
		List<List<String>> data1 =signupdata.raw();
	
		driver.findElement(By.id("u_0_m")).sendKeys(data1.get(0).get(0));
		driver.findElement(By.name("lastname")).sendKeys(data1.get(0).get(1));
		driver.findElement(By.name("reg_email__")).sendKeys(data1.get(0).get(2));
		driver.findElement(By.name("reg_passwd__")).sendKeys(data1.get(0).get(3));
	}

//	@Then("^user click on signup$")
//	public void user_click_on_signup()  {
//		
//	   
//	}



}
