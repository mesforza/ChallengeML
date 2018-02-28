package MercadoLibre;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class LoginDataDrivenTestCase extends Base{

	public WebDriver driver=null;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void LoginBS() throws IOException
	{
		//Home Page
		HomePage mlhomepage=new HomePage (driver);
		mlhomepage.Nationality().click();
		mlhomepage.Login().click();
		
		//Login Page
		LoginPage mlloginpage=new LoginPage (driver);
		mlloginpage.UserName().sendKeys(prop.getProperty("username"));
		mlloginpage.ContinueButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mlloginpage.Password().sendKeys(prop.getProperty("password"));
		mlloginpage.LoginButton().click();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
