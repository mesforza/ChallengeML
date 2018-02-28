package MercadoLibre;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;


public class HelpTakeGoodPhotosTestCase extends Base{
	
	
	public static Logger log =LogManager.getLogger(HelpTakeGoodPhotosTestCase.class.getName());
	
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
		mlhomepage.Nationality().click();
		log.info("Found the nationality Argentina");
		mlhomepage.OptionHelp().click();
		log.info("Found the option Help");
		
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
