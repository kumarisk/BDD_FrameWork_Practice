//package StepDefenitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//
//public class LoginStepDefenition {
//	
//	 WebDriver driver;
//	
//	@Given("^User is on home page$")
//	public void User_is_on_home_page() {
//		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		
//		 driver.manage().window().maximize();
//	        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//	        driver.manage().deleteAllCookies();
//	        driver.get("https://qa.jaleshcruises.com/");
//	}
//	
//	@When("^User click on the login$")
//	public void User_click_on_the_login() {
//		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//		WebElement loginbtn = driver.findElement(By.xpath("//a[@class=\"login_btn\"]"));
//		loginbtn.click();
//	}
//	
//	@Then("^User enter username and password$")
//	public void user_enter_username_and_password()  {
//		WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"][@id=\"login_string\"]")); 
//		email.sendKeys("pankaj91as@gmail.com");
//		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"][@id=\"login_pass\"]"));
//		password.sendKeys("Pankaj@123");
//	}
//	
//	@Then("^User click on the login button$")
//	public void user_click_on_the_login_button()  {
//		WebElement loginbtn_user = driver.findElement(By.xpath("//button[@type=\"button\"][@class=\"btn btn-primary submit_login\"]"));
//	    loginbtn_user.click();
//	}
//	
//	@Then("^User is on the home page as user$")
//	public void user_is_on_the_home_page_as_user()  {
//		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//		
//		WebElement usermenu = driver.findElement(By.xpath("//li[@class='user_dropdown']"));
//		String user = usermenu.getText();
//		System.out.println(user);
//		Assert.assertEquals("Hi Travel Agent", user);
//	   
//	}
//
//}
