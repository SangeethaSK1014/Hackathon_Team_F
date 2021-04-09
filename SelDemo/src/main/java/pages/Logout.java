package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout {
	
	private WebDriver driver;

	private By myAccount = By.xpath("//div[@class='btn-group dropdown-group']");
	private By logout = By.xpath("//a[@class = 'logout']");
	
	
	public Logout(WebDriver driver) {

		this.driver = driver;
		
	}

	
	public void logoutApp() throws InterruptedException {
		
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement dropdown = driver.findElement(myAccount);
		actions.moveToElement(dropdown).click().build().perform();

		Thread.sleep(2000);
		WebElement logoutbtn = driver.findElement(logout);
		actions.moveToElement(logoutbtn).click().build().perform();
		

}
}