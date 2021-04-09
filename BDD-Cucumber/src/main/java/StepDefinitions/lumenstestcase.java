package StepDefinitions;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProvider.ConfigFileReader;
import factory.driverfactory;
import pages.loginpage;
import utils.ExcelReader;

public class lumenstestcase {
	
	WebDriver driver;
	loginpage LoginPage;
	ConfigFileReader configfile;
	Properties prop;
	driverfactory DriverFactory;
	
  
	        
	//private loginpage loginpage =new loginpage(driver);

	@Before(order = 0)
    public void getProperty() {
		configfile = new ConfigFileReader();
        prop = configfile.init_prop();
    }

 

    @Before(order = 1)
    public void launchBrowser() {
        String browserName = prop.getProperty("browser");
        DriverFactory = new driverfactory();
        driver = DriverFactory.init_driver(browserName);
        
    }
	@Given("^user should create an account$")
	public void user_should_create_an_account() throws Throwable {

	        driver.get(prop.getProperty("url"));
	    //driver.get("https://www.lumens.com/");
        
        /*driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
        driver.findElement(By.xpath("//a[@id='my_account_hdr_link']")).click();
        driver.findElement(By.xpath ("//input[@id='dwfrm_profile_customer_firstname']")).sendKeys("sangeetha");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_lastname']")).sendKeys("S.K");
        driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_email']")).sendKeys("sksangeetha1014@gmail.com");
    
        //driver.findElement(By.xpath("/input[@id='dwfrm_profile_customer_email']")).sendKeys("sksangeetha1014@gmail.com");
        driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_emailconfirm']")).sendKeys("sksangeetha1014@gmail.com");
        Thread.sleep(2000);
       	driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_password']")).sendKeys("sangeetha1014");
      	driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_passwordconfirm']")).sendKeys("sangeetha1014");
      			 Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click();  */ 
	}
	
	
	@Given("^enter login credentials from sheet \"([^\"]*)\" and (\\d+)$")
	public void enter_login_credentials_from_sheet_and(String SheetName, int RowNumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(prop.getProperty("account_xpath"))).click();
        driver.findElement(By.xpath(prop.getProperty("myaccount_click_xpath"))).click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("close_popup_xpath"))));
        driver.findElement(By.xpath(prop.getProperty("close_popup_xpath"))).click();
		ExcelReader reader=new ExcelReader();
		loginpage login=new loginpage(driver);
		List<Map<String,String>> testData =reader.getData("C:\\Users\\Sangeetha S K\\Desktop\\login sheet.xlsx", SheetName);
		String email =testData.get(RowNumber).get("EmailId");
		String password =testData.get(RowNumber).get("Password");
		
		login.fillLoginForm(email, password);
		
	}
	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions'
		loginpage login=new loginpage(driver);
		login.clickSend();
	}
	@And("^user clicks on ligthing tab$")
	public void user_clicks_on_ligthing_tab() throws Throwable {
		//driver.findElement(By.xpath("//span[contains(text(),'lighting')]")).click();
		WebElement ele=  driver.findElement(By.xpath(prop.getProperty("mouseover_lighting_xpath")));
		Actions act =new Actions( driver);
		act.moveToElement(ele).perform();
		 driver.findElement(By.xpath(prop.getProperty("click_lighting_path"))).click();
		
	}
	
	@Then("^user select on Chandeliers$")
	public void user_select_on_Chandeliers() throws Throwable {
		 driver.findElement(By.xpath(prop.getProperty("click_chandeliers_xpath"))).click();
	}
	@And("^user selects on LargeChandeliers$")
	public void user_selects_on_LargeChandeliers() throws Throwable {
		 driver.findElement(By.xpath(prop.getProperty("click_large_chandelier_xpath"))).click();
	}
	@Then("^user add filters and check filters$")
	public void user_add_filters_and_check_filters() throws Throwable {
		
        JavascriptExecutor js = (JavascriptExecutor)  driver;
		//driver.findElement(By.xpath("//a[@title='Click to Refine By 1 business day']//input[@type='checkbox']")).click();
        js.executeScript("window.scrollBy(5,500)");
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.xpath(prop.getProperty("Chandelier_name_select_xpath"))).click();

	  JavascriptExecutor java = (JavascriptExecutor)  driver;
	  java.executeScript("window.scrollBy(15,500)");
	  Thread.sleep(1000);
	  driver.findElement(By.id("add-to-cart")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(prop.getProperty("checkout_xpath"))).click();
	  
	  WebElement ele= driver.findElement(By.xpath(prop.getProperty("mouseover_list_view_xpath")));
      Actions act =new Actions(driver);
     act.moveToElement(ele).perform();
     driver.findElement(By.xpath(prop.getProperty("mouseover_list_xpath"))).click();
     driver.findElement(By.xpath(prop.getProperty("click_list_xpath"))).click();
     
     
     driver.findElement(By.xpath(prop.getProperty("remove_item_xpath"))).click();
     driver.findElement(By.xpath(prop.getProperty("sign_out_xpath"))).click();

       
        }
	
	/*@After
    public  void meantforfailed_testcases(Scenario scenario) throws Exception{
        Thread.sleep(3000);
       
        if(scenario.isFailed()) {
        
            String screenshotName=scenario.getName().replaceAll(" ", " ");
           
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("C:\\Users\\Sangeetha S K\\git\\Hackathon-Team-F\\BDD-Cucumber\\screenshot" + screenshotName + ".png" ));
            System.out.println("testing screenshotName:"+ screenshotName);
        	
            scenario.embed(screenshot, "png");
       
        }*/
   
}


	