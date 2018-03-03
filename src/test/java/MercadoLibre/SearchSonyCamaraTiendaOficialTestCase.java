package MercadoLibre;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Base;

public class SearchSonyCamaraTiendaOficialTestCase extends Base {
	
	private static Logger log =LogManager.getLogger(SearchSonyCamaraTiendaOficialTestCase.class.getName());

	@BeforeTest
	public void initialize() throws IOException
	{		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void SearchSonyCamaraTiendaOficial() throws IOException
	{
	//Home page
	HomePage mlhomepage=new HomePage (driver);
	mlhomepage.NationalityArg().click();
	log.info("Entering the website of Mercado Libre Argentina");
	mlhomepage.Login().click();
	File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\Martín\\screenshot.png"));

	//Login page
	LoginPage mlloginpage=new LoginPage (driver);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mlloginpage.UserName().sendKeys("1martin2");
	mlloginpage.ContinueButton().click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	mlloginpage.Password().sendKeys("automation");
	mlloginpage.LoginButton().click();
	
	mlhomepage.TiendaOficial().click();
	
	//Tienda oficial home page
	TiendaOficialHomePage mltiendaoficialhomepage=new TiendaOficialHomePage (driver);
	mltiendaoficialhomepage.TiendaSony().click();
	
	//Tienda oficial page
	TiendaOficialPage mltiendaoficialpage=new TiendaOficialPage (driver);
	mltiendaoficialpage.CamarasAccesorios().click();
	mltiendaoficialpage.Camaras().click();
	mltiendaoficialpage.fromPrice().sendKeys("35000");
	mltiendaoficialpage.ToPrice().sendKeys("45000");
	mltiendaoficialpage.Search().click();
	mltiendaoficialpage.SelectCameraSony().click();
	
	//Product page
	ProductPage mlproductpage=new ProductPage (driver);
	mlproductpage.SeePic2().click();
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
