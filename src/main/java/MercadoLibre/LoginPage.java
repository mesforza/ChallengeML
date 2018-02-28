package MercadoLibre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	
	public WebDriver driver=null;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By UserName=By.id("user_id");	
	By ContinueButton=By.xpath("//*[@id='login_user_form']/div[2]/input");
	By Password=By.id("password");
	By LoginButton=By.xpath("//*[@id='action-complete']");
	By LoginLink=By.id("login-link");
		

	public WebElement UserName() {
		// TODO Auto-generated method stub
		return driver.findElement(UserName);
		
	}

	public WebElement ContinueButton() {
		// TODO Auto-generated method stub
		return driver.findElement(ContinueButton);
	}

	public WebElement Password() {
		// TODO Auto-generated method stub
		return driver.findElement(Password);
	}

	public WebElement LoginButton() {
		// TODO Auto-generated method stub
		return driver.findElement(LoginButton);
	}

	public WebElement LoginLink() {
		// TODO Auto-generated method stub
		return driver.findElement(LoginLink);
	}
	
}
