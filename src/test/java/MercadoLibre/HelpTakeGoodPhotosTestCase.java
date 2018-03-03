package MercadoLibre;

import java.io.IOException;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;


public class HelpTakeGoodPhotosTestCase extends Base{
	
	
	private static Logger log =LogManager.getLogger(HelpTakeGoodPhotosTestCase.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void HelpTakeGoodPhotos() throws IOException
	
	{
		//Home Page
		HomePage mlhomepage=new HomePage (driver);
		mlhomepage.NationalityArg().click();
		log.info("Entering the website of Mercado Libre Argentina.");
		mlhomepage.OptionHelp().click();
		log.info("Entering the Help page.");
		
		//Help Page
		HelpPage mlhelppage=new HelpPage (driver);
		mlhelppage.Selling().click();
		mlhelppage.Publication().click();
		mlhelppage.GoodPublishing().click();
		mlhelppage.TakeGoodPhotos().click();
		mlhelppage.TakeGoodPhotosProducts().click();
		mlhelppage.ProductRecomendation1();
		mlhelppage.ProductRecomendation2();
		mlhelppage.ProductRecomendation3();
		mlhelppage.ProductRecomendation4();		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
