package MercadoLibre;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;
import java.io.IOException;

public class MoreInformationMercadoPagoTestCase extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}	
	
	@Test
	public void MoreInformationMercadoPago() throws IOException
	{
		//Home Page
		HomePage mlhomepage=new HomePage (driver);
		mlhomepage.Nationality().click();
		mlhomepage.MoreInformation().click();
		mlhomepage.MercadoPago();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
