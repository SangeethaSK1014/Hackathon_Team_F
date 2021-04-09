package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.ConfigReader;

public class CreateAccountPage {


	private By account = By.xpath("//div[@class='btn-group dropdown-group']");
	private By accountCreation = By.xpath("//a[@id='my_account_hdr_link']");
	private By createAccountBtn = By.xpath("//button[@id='createAccountBtn']");
	private By firstName = By.xpath("//input[@id='dwfrm_profile_customer_firstname']");
	private By lastName = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
	private By email = By.xpath("//input[@id='dwfrm_profile_customer_email']");
	private By emailConfirm = By.xpath("//input[@id='dwfrm_profile_customer_emailconfirm']");
	private By password = By.xpath("//input[@name='dwfrm_profile_login_password']");
	private By confirmpassword = By.xpath("//input[@name='dwfrm_profile_login_passwordconfirm']");
	private By createBtn = By.xpath("//span[contains(text(),'Create Account')]");
	
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	public CreateAccountPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void buttonClick() throws InterruptedException {
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement acc = driver.findElement(account);
	    action.moveToElement(acc).click().build().perform();
		Thread.sleep(1000);
		driver.findElement(accountCreation).click();
	}
	
	public void createAccount() {
		
	   prop = configReader.init_prop();

		driver.findElement(firstName).sendKeys(prop.getProperty("firstName"));
		driver.findElement(lastName).sendKeys(prop.getProperty("lastName"));
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(emailConfirm).sendKeys(prop.getProperty("emailConfirm"));
		driver.findElement(password).sendKeys(prop.getProperty("password"));
		driver.findElement(confirmpassword).sendKeys(prop.getProperty("confirmpassword"));
		driver.findElement(createBtn).click();
		
	}

}
