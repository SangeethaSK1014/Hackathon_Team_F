package com.stepstoTest;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factory.DriverFactory;
import pages.CreateAccountPage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ExcelRead;
import pages.Logout;


public class StepLumenDemo {
	
	DriverFactory driverFactory;
    WebDriver driver;
	ConfigReader configReader;
	Properties prop;
	WebDriverWait wait;
	CreateAccountPage CA;
	LoginPage log;
	Logout logout;
	

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		
	}
	
	@Given("^Navigate to Lumen URL$")
	public void navigate_to_Lumen_URL() throws Throwable {
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ltkpopup-close-button']")));
		driver.findElement(By.xpath("//*[@id='ltkpopup-close-button']")).click();
	}

	@When("^Verify the Home Page$")
	public void verify_the_Home_Page() throws Throwable {
		String ExpectedTitle = "Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

	//@Then("^User click on Account and and Create Account$")
	//public void user_click_on_Account_and_and_Create_Account() throws Throwable {
	//	
//		CreateAccountPage CA = new CreateAccountPage(driver);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='btn-group dropdown-group']")));
//		CA.buttonClick();
//		CA.createAccount();
	//}
	//
	//@Then("^Account is successfully created$")
	//public void account_is_successfully_created() throws Throwable {
//	    System.out.println("Account is successfully Created");
	//}
	@Then("^User Sign in the application$")
	public void user_Sign_in_the_application() throws Throwable {

		Actions actions = new Actions(driver);
		
		WebElement Account = driver.findElement(By.xpath("//div[@class='btn-group dropdown-group']"));
		actions.moveToElement(Account).click().build().perform();
		
		WebElement signin = driver.findElement(By.xpath("//div[@class='customerInfo dropdown-item']//a[@class='userlogin'][normalize-space()='Sign In']"));
		actions.moveToElement(signin).click().build().perform();
	}

	@Then("^user fills the form from given sheetname \"(.*?)\" and rownumber (\\d+)$")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, int rowNumber) throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dwfrm_login_username']")));
		ExcelRead reader = new ExcelRead();
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\sahua\\OneDrive\\Desktop\\SignIn.xlsx", sheetName);
		
		LoginPage log = new LoginPage(driver);
		
		String UsrName = testData.get(rowNumber).get("UserName");
		String pwd = testData.get(rowNumber).get("Password");
		
		log.signIn(UsrName, pwd);
		
		 Thread.sleep(2000);
	}


	@Then("^User Search item in searchbar$")
	public void user_Search_item_in_searchbar() throws Throwable {
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='searchinput']")).sendKeys("ceiling fans");
		driver.findElement(By.xpath("//*[@id='searchinput']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("^User Click on Add to cart$")
	public void user_Click_on_Add_to_cart() throws Throwable {
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Torsion Ceiling Fan']")));
		driver.findElement(By.xpath("//img[@title='Torsion Ceiling Fan']")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)"); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id = 'add-to-cart']")).click();
		Thread.sleep(2000);
	}

	@Then("^User Navigate to the Cart and validate the item$")
	public void user_Navigate_to_the_Cart_and_validate_the_item() throws Throwable {
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='minicart_checkout_continue minicart_popup_normal d-inline-block float-right mb-3 mt-0']/a[1]")));
		driver.findElement(By.xpath("//div[@class='minicart_checkout_continue minicart_popup_normal d-inline-block float-right mb-3 mt-0']/a[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='divquantity']/span[2]")).click();
		
		String ExpectedTitle = "Applying";
	    
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");

		Thread.sleep(3000);

		WebElement text=driver.findElement(By.xpath("//div[@class='couponcode']/input"));
		text.sendKeys("Archana");
		text.getText();
		driver.findElement(By.xpath("//div[@class='couponcode']/button")).click();
		Thread.sleep(3000);
		
		WebElement mycart =driver.findElement(By.xpath("//*[@id='mcBookMark']/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mycart).build().perform();
		
		Assert.assertEquals(text, ExpectedTitle);
		
		
	}

//	@Then("^Logout$")
//	public void Logout() throws Throwable {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='btn-group dropdown-group']")));
//		Logout logout = new Logout(driver);
//		logout.logoutApp();
//		
//	}



@After(order = 0)
public void quitBrowser() {
	driver.quit();
}

@After(order = 1)
public void embedScreenshot(Scenario scenario) throws Exception {
    if (scenario.isFailed()) {
        try {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            String testName = scenario.getName();
            scenario.embed(screenshot, "image/png");
            scenario.write(testName);
        } catch (WebDriverException wde) {
           System.err.println(wde.getMessage());
        } catch (ClassCastException cce) {
            cce.printStackTrace();}
        }
    }

}

