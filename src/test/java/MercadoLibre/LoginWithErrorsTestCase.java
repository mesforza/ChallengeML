package MercadoLibre;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class LoginWithErrorsTestCase extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void Login() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
				
		//Home Page
		HomePage mlhomepage=new HomePage (driver);
		mlhomepage.Nationality().click();
		mlhomepage.Login().click();
		
		//Login Page
		LoginPage mlloginpage=new LoginPage (driver);
		mlloginpage.UserName().sendKeys("prueba");
		mlloginpage.ContinueButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//*[@id='login_user_form']/div[1]/div/div/div/a")).getText().contains("Mercado Libre México")) 
		  {
		    System.out.println("User 'prueba' is from Mexico.");
		  }
		else
		  {
		    System.out.println("User 'prueba' is from Argentina.");
		  }
		mlloginpage.UserName().clear();
		mlloginpage.UserName().sendKeys("1martin2");
		mlloginpage.ContinueButton().click();
		mlloginpage.Password().sendKeys("Incorrecta");
		mlloginpage.LoginButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//*[@id='login_user_form']/div[1]/div/div/div")).getText().contains("Revisá tu clave.")) 
		  {
		    System.out.println("Wrong password.");
		  }
		else
		  {
		    System.out.println("Right password.");
		  }
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mlloginpage.Password().sendKeys("automation");
		mlloginpage.LoginButton().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
