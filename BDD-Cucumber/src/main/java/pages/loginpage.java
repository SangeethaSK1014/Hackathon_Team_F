package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class loginpage {
   private WebDriver driver;
	
	private By EmailAddress = By.id("dwfrm_login_username");
	private By Password = By.id("dwfrm_login_password");
	private By LoginButton = By.name("dwfrm_login_login");
	

	public loginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillLoginForm(String Email, String password) {
		
		driver.findElement(EmailAddress).sendKeys(Email);
		driver.findElement(Password).sendKeys(password);
	}
	

	public void clickSend() {
		driver.findElement(LoginButton).click();
	}
}

