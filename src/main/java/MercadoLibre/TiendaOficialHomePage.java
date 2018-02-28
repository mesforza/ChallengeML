package MercadoLibre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TiendaOficialHomePage {


	private WebDriver driver;

	public TiendaOficialHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By TiendaSony=By.xpath("//a[contains(@href,'https://tienda.mercadolibre.com.ar/sony')]");

	public WebElement TiendaSony() {
		// TODO Auto-generated method stub
		return driver.findElement(TiendaSony);
	}

}

