//package StepDefenitions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class AddMaxRoomsStepDefenition {
//	
//	WebDriver driver;
//	
//		@Given("^User is on home page with login$")
//		public void User_is_on_home_page_with_login()  {
//			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//		
//		WebElement usermenu = driver.findElement(By.xpath("//li[@class='user_dropdown']"));
//		String user = usermenu.getText();
//		System.out.println(user);
//		Assert.assertEquals("Hi Travel Agent", user);
//	   
//	}
//		
//		@Then("^user click on rooms$")
//		public void user_click_on_rooms() {
//			//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//			
//			 WebElement roombtn = driver.findElement(By.xpath("//div[@class='booking-filter']//a[@id='total-rooms']"));
//			 JavascriptExecutor js = (JavascriptExecutor)driver;
//			 js.executeScript("arguments[0].click();", roombtn);
//			 
//	         WebElement webelee = driver.findElement(By.xpath("//select[@id='room-1-categ']"));
//	         webelee.click();
//	             List<WebElement> ral1 = driver.findElements(By.xpath("//select[@id='room-1-categ'] /option"));
//	                 System.out.println(ral1.size());
//	                 for (int i = 0; i <= ral1.size(); i++) {
//	                 ral1.get(0).click();
//	          }
//	                 
//	         driver.findElement(By.xpath("//select[@id='room-1-adult']")).click();   //this is for adding adults
//	         List<WebElement> rala1 = driver.findElements(By.xpath("//select[@id='room-1-adult'] /option"));
//	                 System.out.println(rala1.size());
//	                         for (int i = 0; i <= rala1.size(); i++) {
//	                        	 rala1.get(1).click();
//	                     }
//	                         
//	         driver.findElement(By.xpath("//select[@id='room-1-children']")).click();  //this is for adding children's
//	         List<WebElement> ralc1 = driver.findElements(By.xpath("//select[@id='room-1-children'] /option"));
//	                  System.out.println(ralc1.size());
//	                          for (int i = 0; i <= ralc1.size(); i++) {
//	                              ralc1.get(1).click();
//	                             }
//	                                 
//	         driver.findElement(By.xpath("//select[@id='room-1-infant']")).click();  //this is for adding Infant's
//	         List<WebElement> rali1 = driver.findElements(By.xpath("//select[@id='room-1-infant'] /option"));
//	                  System.out.println(rali1.size());
//	                           for (int i = 0; i <= rali1.size(); i++) {
//	                               rali1.get(1).click();
//	                                     }
//			
//		}
//		
//		@Then("^user click on add room2 button$")
//		public void user_click_on_add_room2_button() {
//			
//				driver.findElement(By.xpath("//a[contains(text(),'ADD ROOMS')]")).click();
//			    WebElement webela = driver.findElement(By.xpath("//select[@id='room-2-categ']"));
//			    	webela.click();
//			        List<WebElement> ral2 = driver.findElements(By.xpath("//select[@id='room-2-categ'] /option"));
//			            System.out.println(ral2.size());
//			                for (int i1 = 0; i1 <= ral2.size(); i1++) {
//			                ral2.get(1).click();
//		            }
//		
//				 driver.findElement(By.xpath("//select[@id='room-2-adult']")).click();   //this is for adding adults
//		         List<WebElement> ralad1 = driver.findElements(By.xpath("//select[@id='room-2-adult'] /option"));
//		             System.out.println(ralad1.size());
//		                 for (int i = 0; i <= ralad1.size(); i++) {
//		                 ralad1.get(1).click();
//		             }
//			
//
//				driver.findElement(By.xpath("//select[@id='room-2-children']")).click();  //this is for adding children's
//		        List<WebElement> ralch1 = driver.findElements(By.xpath("//select[@id='room-2-children'] /option"));
//		            System.out.println(ralch1.size());
//		                for (int i = 0; i <= ralch1.size(); i++) {
//		                ralch1.get(1).click();
//		            }
//			
//				driver.findElement(By.xpath("//select[@id='room-2-infant']")).click();  //this is for adding Infant's
//		        List<WebElement> ralin1 = driver.findElements(By.xpath("//select[@id='room-2-infant'] /option"));
//		            System.out.println(ralin1.size());
//		                for (int i = 0; i <= ralin1.size(); i++) {
//		                ralin1.get(0).click();
//		            }
//
//		}
//		
//		@Then("^user click on add room3 button$")
//		public void user_click_on_add_room3_button() {
//			
//			driver.findElement(By.xpath("//a[contains(text(),'ADD ROOMS')]")).click();
//	        WebElement webeag = driver.findElement(By.xpath("//select[@id='room-3-categ']"));
//	        webeag.click();
//	           List<WebElement> rag3 = driver.findElements(By.xpath("//select[@id='room-3-categ'] /option"));
//	               System.out.println(rag3.size());
//	                   for (int i1 = 0; i1 <= rag3.size(); i1++) {
//	                   rag3.get(2).click();
//	               }
//		
//			driver.findElement(By.xpath("//select[@id='room-3-adult']")).click();   //this is for adding adults
//	        List<WebElement> raladu1 = driver.findElements(By.xpath("//select[@id='room-3-adult'] /option"));
//	            System.out.println(raladu1.size());
//	                for (int i = 0; i <= raladu1.size(); i++) {
//	                raladu1.get(1).click();
//	            }
//	
//			driver.findElement(By.xpath("//select[@id='room-3-children']")).click();  //this is for adding children's
//	        List<WebElement> ralchi1 = driver.findElements(By.xpath("//select[@id='room-3-children'] /option"));
//	            System.out.println(ralchi1.size());
//	                for (int i = 0; i <= ralchi1.size(); i++) {
//	                ralchi1.get(0).click();
//	            }
//		
//			driver.findElement(By.xpath("//select[@id='room-3-infant']")).click();  //this is for adding Infant's
//	        List<WebElement> ralinf1 = driver.findElements(By.xpath("//select[@id='room-3-infant'] /option"));
//	            System.out.println(ralinf1.size());
//	            for (int i = 0; i <= ralinf1.size(); i++) {
//	            ralinf1.get(2).click();
//	            }
//			
//		}
//		
//		@Then("^user click on add room4 button$")
//		public void user_click_on_add_room4_button() {
//			
//			driver.findElement(By.xpath("//a[contains(text(),'ADD ROOMS')]")).click();
//	        WebElement webellag = driver.findElement(By.xpath("//select[@id='room-4-categ']"));
//	        webellag.click();
//	            List<WebElement> rag4 = driver.findElements(By.xpath("//select[@id='room-4-categ'] /option"));
//	                System.out.println(rag4.size());
//	                    for (int i1 = 0; i1 <= rag4.size(); i1++) {
//	                    rag4.get(3).click();
//	                }
//		
//			driver.findElement(By.xpath("//select[@id='room-4-adult']")).click();   //this is for adding adults
//	        List<WebElement> raladul1 = driver.findElements(By.xpath("//select[@id='room-3-adult'] /option"));
//	            System.out.println(raladul1.size());
//	                for (int i = 0; i <= raladul1.size(); i++) {
//	                raladul1.get(1).click();
//	            }
//		
//		
//			driver.findElement(By.xpath("//select[@id='room-4-children']")).click();  //this is for adding children's
//	        List<WebElement> ralchil1 = driver.findElements(By.xpath("//select[@id='room-4-children'] /option"));
//	            System.out.println(ralchil1.size());
//	                for (int i = 0; i <= ralchil1.size(); i++) {
//	                ralchil1.get(1).click();
//	            }
//		
//			driver.findElement(By.xpath("//select[@id='room-4-infant']")).click();  //this is for adding Infant's
//	        List<WebElement> ralinfa1 = driver.findElements(By.xpath("//select[@id='room-4-infant'] /option"));
//	            System.out.println(ralinfa1.size());
//	                for (int i = 0; i <= ralinfa1.size(); i++) {
//	                ralinfa1.get(0).click();
//	            }
//			
//		}
//		
//		@Then("^user click on add room5 button$")
//		public void user_click_on_add_room5_button() {
//			
//			driver.findElement(By.xpath("//a[contains(text(),'ADD ROOMS')]")).click();
//	        WebElement webeelag = driver.findElement(By.xpath("//select[@id='room-5-categ']"));
//	        webeelag.click();
//	            List<WebElement> rag5 = driver.findElements(By.xpath("//select[@id='room-5-categ'] /option"));
//	                System.out.println(rag5.size());
//	                    for (int i1 = 0; i1 <= rag5.size(); i1++) {
//	                    rag5.get(0).click();
//	                }
//		
//		
//			 driver.findElement(By.xpath("//select[@id='room-5-adult']")).click();   //this is for adding adults
//	         List<WebElement> raladult1 = driver.findElements(By.xpath("//select[@id='room-5-adult'] /option"));
//	             System.out.println(raladult1.size());
//	                 for (int i = 0; i <= raladult1.size(); i++) {
//	                 raladult1.get(0).click();
//	             }
//		
//		
//			driver.findElement(By.xpath("//select[@id='room-5-children']")).click();  //this is for adding children's
//	        List<WebElement> ralchild1 = driver.findElements(By.xpath("//select[@id='room-5-children'] /option"));
//	            System.out.println(ralchild1.size());
//	                for (int i = 0; i <= ralchild1.size(); i++) {
//	                ralchild1.get(1).click();
//	            }
//		
//			 driver.findElement(By.xpath("//select[@id='room-5-infant']")).click();  //this is for adding Infant's
//	         List<WebElement> ralinfan1 = driver.findElements(By.xpath("//select[@id='room-5-infant'] /option"));
//	             System.out.println(ralinfan1.size());
//	                 for (int i = 0; i <= ralinfan1.size(); i++) {
//	                 ralinfan1.get(2).click();
//	             }
//			
//		}
//		
//		@Then("^user click on save button$")
//		public void user_click_on_save_button() {
//			
//			WebElement savebtn = driver.findElement(By.xpath("//input[@class=\"custom-btn  dark float-right cursor-pointer\"]"));
//			savebtn.click();
//			
//		}
//		
//		@When("^user click on book button$")
//		public void user_click_on_book_button() {
//			
//			WebElement searchbtn =  driver.findElement(By.xpath("//button[@class=\"custom-btn dark filter-search-btn\"]"));
//			searchbtn.click();
//			
//		}
//		
//		@Then("^user is on cruise list page$")
//		public void user_is_on_cruise_list_page() {
//			
//			WebElement cruiselistspage = driver.findElement(By.xpath("//link[@rel='canonical']"));
//			String url = cruiselistspage.getAttribute("href");
//			System.out.println(url);
//			
//			
//		}
//
//}
