package MercadoLibre;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;


public class MyReputationTestCase extends Base{
	
	private static Logger log =LogManager.getLogger(MyReputationTestCase.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void MyReputation() throws IOException
	{	
		//Home Page
		HomePage mlhomepage=new HomePage (driver);
		mlhomepage.NationalityArg().click();
		log.info("Entering the website of Mercado Libre Argentina");
		mlhomepage.Login().click();
	
		//Login Page
		LoginPage mlloginpage=new LoginPage (driver);
		mlloginpage.UserName().sendKeys("1martin2");
		mlloginpage.ContinueButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mlloginpage.Password().sendKeys("automation");
		mlloginpage.LoginButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Home Page
		mlhomepage.MyProfile().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		mlhomepage.MyAccount();
		
		//Account Page
		AccountPage mlaccountpage=new AccountPage (driver);
		mlaccountpage.MyReputation().click();	
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
