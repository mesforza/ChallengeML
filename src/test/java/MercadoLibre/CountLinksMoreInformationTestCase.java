package MercadoLibre;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;

public class CountLinksMoreInformationTestCase extends Base {
	
	private static Logger log =LogManager.getLogger(CountLinksMoreInformationTestCase.class.getName());

	
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

		mlhomepage.NationalityArg().click();
		log.info("Entering the website of Mercado Libre Argentina");
		mlhomepage.MoreInformation().click();
		log.info("Selected More Information on footer.");
		mlhomepage.CountLinksInformation();
		log.info("Link counter made.");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
