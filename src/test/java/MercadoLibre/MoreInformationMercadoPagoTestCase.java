package MercadoLibre;

import org.apache.logging.log4j.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;
import java.io.IOException;

public class MoreInformationMercadoPagoTestCase extends Base {
	
	private static Logger log =LogManager.getLogger(MoreInformationMercadoPagoTestCase.class.getName());
	
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
		mlhomepage.NationalityArg().click();
		log.info("Entering the website of Mercado Libre Argentina");
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
