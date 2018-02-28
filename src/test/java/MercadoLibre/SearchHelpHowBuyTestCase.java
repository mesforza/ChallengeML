package MercadoLibre;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.Base;

public class SearchHelpHowBuyTestCase extends Base{
	
	@BeforeTest
	public void initialize() throws IOException
	{		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}	
	
	@Test
	public void SearchHelpHowBuy() throws IOException
	{
		//Home Page
		HomePage mlhomepage=new HomePage (driver);
		mlhomepage.Nationality().click();
		mlhomepage.OptionHelp().click();
		
		//Help Page
		HelpPage mlhelppage=new HelpPage (driver);
		mlhelppage.SearchInput().sendKeys("Comprar");
		mlhelppage.SearchButton().click();
		mlhelppage.ChooseSeller().click();
		mlhelppage.GoldMedal();	
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
