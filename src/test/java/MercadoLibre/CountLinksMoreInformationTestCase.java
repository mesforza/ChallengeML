package MercadoLibre;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;

public class CountLinksMoreInformationTestCase extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void CountLinksMoreInformation() throws IOException
	{	
		//Home Page
		HomePage mlhomepage=new HomePage (driver);

		mlhomepage.Nationality().click();
		mlhomepage.MoreInformation().click();
		mlhomepage.CountLinksInformation();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
