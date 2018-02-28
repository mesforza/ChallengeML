package MercadoLibre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	public WebDriver driver;

	By MyReputation=By.id("REPUTATION");
	
	public AccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement MyReputation() {
		// TODO Auto-generated method stub
		return driver.findElement(MyReputation);
	}

}
