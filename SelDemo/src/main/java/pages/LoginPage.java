package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	private By email = By.xpath("//input[@id='dwfrm_login_username']");
	private By password = By.xpath("//*[@id='dwfrm_login_password']");
	private By loginIn = By.xpath("//button[@class='global pop-up']");
	

	public LoginPage(WebDriver driver) {
        
		this.driver = driver;

	}
	
	public void signIn(String UserName, String Password) throws InterruptedException{
		
			    
		    driver.findElement(email).sendKeys(UserName); 
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(password).sendKeys(Password);
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(loginIn).click();
		   
	}


}
