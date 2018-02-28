package MercadoLibre;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class SearchPS4TiendaNoOficialTestCase extends Base{

	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void SearchPS4TiendaNoOficial() throws IOException
	{
	//Home page
	HomePage mlhomepage=new HomePage (driver);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mlhomepage.Nationality().click();
	mlhomepage.NavSearch().sendKeys("Play Station 4");
	mlhomepage.NavSearchButton().click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//Search Results
	SearchResultsPage mlsearchresults=new SearchResultsPage (driver);
	mlsearchresults.NewProducts().click();
	mlsearchresults.LocationCapFed().click();
	mlsearchresults.FromPrice().sendKeys("13000");
	mlsearchresults.ToPrice().sendKeys("20000");
	mlsearchresults.SearchByPrice().click();
	mlsearchresults.PickPS4Pro().click();
	
	//Product Page
	ProductPage mlproductpage=new ProductPage (driver);
	mlproductpage.SeePic2().click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mlproductpage.BrindaBuenaAtencion();
	mlproductpage.SuperOffer();
	mlproductpage.IncrementQuantityBtn().click();
	mlproductpage.IncrementQuantityBtn().click();
	mlproductpage.BidButtonTop().click();	
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
