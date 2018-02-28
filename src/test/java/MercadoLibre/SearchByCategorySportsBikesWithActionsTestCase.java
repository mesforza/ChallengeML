package MercadoLibre;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;
import org.apache.logging.log4j.*;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

public class SearchByCategorySportsBikesWithActionsTestCase extends Base{
	
	private static Logger log =LogManager.getLogger(SearchByCategorySportsBikesWithActionsTestCase.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void SearchByCategorySportsBikes() throws Exception
	{
		//Home Page
		HomePage mlhomepage=new HomePage (driver);
		mlhomepage.Nationality().click();
		log.info("Found the nationality Argentina");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mlhomepage.CategoriesMouseHoverActions();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mlhomepage.Sports();
		mlhomepage.BikesCycling();
		log.info("Entered into Bikes and Cycling");
		
		//SearchResultsPage
		SearchResultsPage mlsearchresults=new SearchResultsPage (driver);
		mlsearchresults.CategoriesBikes().click();
		log.info("Found categorie bikes");
//		log.fatal("The categories bikes wasn't found");
		
		mlsearchresults.NewProducts().click();
		log.info("The categorie New Product was found");
//		log.fatal("The categories new product wasn't found");
		mlsearchresults.LocationCapFed().click();
		mlsearchresults.FromPrice().sendKeys("40000");
		mlsearchresults.ToPrice().sendKeys("70000");
		mlsearchresults.SearchByPrice().click();
		mlsearchresults.PickElectricBike().click();
		
		//Product Page
		ProductPage mlproductpage=new ProductPage (driver);
		mlproductpage.SeePic2().click();
		mlproductpage.BidButtonTop().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}