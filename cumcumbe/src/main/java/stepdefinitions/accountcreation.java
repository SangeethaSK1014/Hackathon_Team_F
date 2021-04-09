package stepdefinitions;



import java.io.File;

import org.apache.commons.io.FileUtils;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import org.openqa.selenium.os.ExecutableFinder;
//import org.openqa.selenium.firefox.FirefoxBinary;
//import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class accountcreation {
	
	  WebDriver driver;
	
	 @Given("^I open browser with URL$")
	 public void i_open_browser_with_URL() throws Throwable {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
		    driver.get("https://www.lumens.com");
		    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		    FileUtils.copyFile(screenshot, new File(".//screnshot/screen.png"));
		    //driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
	        //driver.findElement(By.xpath("//a[@id='my_account_hdr_link']")).click();
		    //driver.findElement(By.id("dwfrm_login_username")).sendKeys("vijaykumarct25@gmail.com");
		    //driver.findElement(By.id("dwfrm_login_password")).sendKeys("VijayKaruna@96");
		    //driver.findElement(By.xpath("//*[@id='dwfrm_login']/fieldset/div[3]/div[2]/button/span")).click();
	 }

	 //@And("^User should create an account$")
	 //public void user_should_create_an_account() throws Throwable {
		//try{
			//Prop =new Properties();
			//System.out.println("Super constructor invokes");
			//FileInputStream file = new FileInputStream("user.dir"+"/cumcumbe/Configuration/config.properties);"
			//prop.load(file);
		//}catch(FileNotFoundException e){
			//e.printStackTrace();
		//}catch(IOException e){
			//e.printStackTrace();
		//}
     //driver.findElement(By.linkText("Account")).click();
	    //driver.findElement(By.className("userlogin")).click();
	    //driver.findElement(By.xpath("//*[@id='createAccountBtn']")).click();
	    //driver.findElement(By.id("dwfrm_profile_customer_firstname")).sendKeys("Vijaykumar");
	    //driver.findElement(By.id("dwfrm_profile_customer_lastname")).sendKeys("S");
	    //driver.findElement(By.id("dwfrm_profile_customer_email")).sendKeys("vijaykumarct25@gmail.com");
	    //driver.findElement(By.id("dwfrm_profile_customer_emailconfirm")).sendKeys("vijaykumarct25@gmail.com");
	    //driver.findElement(By.id("dwfrm_profile_login_password")).sendKeys("VijayKaruna@96");
	    //driver.findElement(By.id("dwfrm_profile_login_passwordconfirm")).sendKeys("VijayKaruna@96");
	    //driver.findElement(By.xpath("//*[@id='RegistrationForm']")).click();
//}

	/* @And("^Login to application$")
	 public void login_to_application() throws Throwable {
		//Login the user
			
			driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
	        driver.findElement(By.xpath("//a[@id='my_account_hdr_link']")).click();
		    driver.findElement(By.id("dwfrm_login_username")).sendKeys("vijaykumarct25@gmail.com");
		    driver.findElement(By.id("dwfrm_login_password")).sendKeys("VijayKaruna@96");
		    driver.findElement(By.xpath("//*[@id='dwfrm_login']/fieldset/div[3]/div[2]/button/span")).click();
	  }*/

	 @Then("^user verify the title of the url$")
	 public void user_verify_the_title_of_the_url() throws Throwable {
		//Gettitle of the page
		    String pgtitle = driver.getTitle();
		    System.out.println(pgtitle);
	   
	 }

	 @Then("^User add the product to cart and remove it$")
	 public void user_add_the_product_to_cart_and_remove_it() throws Throwable {
		//Click on Lighting tab
			WebElement el = driver.findElement(By.xpath("//span[contains(text(),'lighting')]"));
			Actions act = new Actions(driver);
			act.moveToElement(el).perform();
			driver.findElement(By.xpath("//*[@id=\"nav-tab-01\"]/a/span[1]")).click();
			
			//Click on Chandeliers
			driver.findElement(By.xpath("//span[contains(text(), 'Chandeliers')]")).click();
			
			//Click on LargeChandeliers
			
			driver.findElement(By.xpath("//span[contains(text(), 'Large Chandeliers')]")).click();
			
			//Click on Ellisse LED Double Chandelier
			
			driver.findElement(By.xpath("//span[contains(text(), 'Ellisse LED Double Chandelier')]")).click();
			
			//Add product to cart
			driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
			driver.findElement(By.xpath("//*[@title='View Cart']")).click();
			
			//Remove product from cart
			driver.findElement(By.xpath("//span[contains(text(), 'Remove')]")).click(); 
	     
	 }

	 @Then("^User apply coupon code$")
	 public void user_apply_coupon_code() throws Throwable {
		//User apply Coupon Code
		    driver.findElement(By.name("dwfrm_cart_couponCode")).sendKeys("ABCD");
		    driver.findElement(By.xpath("//*[@id=\"dwfrm_cart\"]/fieldset/table/tfoot/tr/td/div[1]/button/span")).click();
	     
	 }

	 @Then("^User perform scrollup and scroll down action$")
	 public void user_perform_scrollup_and_scroll_down_action() throws Throwable {
		//Scrolling down in webpage
		  JavascriptExecutor jse =(JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,500)");
		  Thread.sleep(3000);
		  
		  //Scrolling up in webpage
		  jse.executeScript("window.scrollBy(0,-500)");
		  Thread.sleep(3000);
	     
	 }

	 @And("^User logout the page$")
	 public void user_logout_the_page() throws Throwable {
		//Logout the user
			driver.findElement(By.xpath("//span[contains(text(), 'Account')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(), 'Sign Out')]")).click();
			driver.close();
	     
	 }
}