package MercadoLibre;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;

public class LoginMultipleUsersTestCase extends Base {
	
	private static Logger log =LogManager.getLogger(LoginMultipleUsersTestCase.class.getName());
	
	public static  WebDriver driver;
	
	@BeforeMethod
	public void initialize() throws IOException
	{		
		driver=initializeDriver();		
	}
	
	@Test(dataProvider="MultipleUsers")
	public void Login(String uname,String password) throws IOException
	{
		driver.get(prop.getProperty("url"));
		//Home Page
		HomePage mlhomepage=new HomePage (driver);
		mlhomepage.NationalityArg().click();
		log.info("Entering the website of Mercado Libre Argentina");
		mlhomepage.Login().click();
		
		//Login Page
		LoginPage mlloginpage=new LoginPage (driver);
		mlloginpage.UserName().sendKeys(uname);
		mlloginpage.ContinueButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mlloginpage.Password().sendKeys(password);
		mlloginpage.LoginButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mlloginpage.LoginButton().click();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		driver=null;
	}
		
	@DataProvider(name="MultipleUsers")
		public Object[][] multipleusers(){
			Object [][] mlusers=new Object[2][2];
			mlusers[0][0]="1martin2";
			mlusers[0][1]="automation";
			mlusers[1][0]="martin1";
			mlusers[1][1]="nopassword";
			return mlusers;
			}

		
	}

