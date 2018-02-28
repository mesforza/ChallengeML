package MercadoLibre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TiendaOficialPage {

	private WebDriver driver;

	public TiendaOficialPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By CamarasAccesorios=By.xpath("//a[contains(@href,'camaras-accesorios/_Tienda_sony')]");	
	By Camaras=By.xpath("//*[@id='id_category']/dd[2]/h3/a");
	By fromPrice=By.id("fromPrice");
	By ToPrice=By.id("toPrice");
	By Search=By.xpath("//*[@id='priceForm']/div/button");
	By SelectCameraSony=By.id("MLA658440792");

	public WebElement CamarasAccesorios() {
		// TODO Auto-generated method stub
		return driver.findElement(CamarasAccesorios);
	}

	public WebElement Camaras() {
		// TODO Auto-generated method stub
		return driver.findElement(Camaras);
	}

	public WebElement fromPrice() {
		// TODO Auto-generated method stub
		return driver.findElement(fromPrice);
	}

	public WebElement ToPrice() {
		// TODO Auto-generated method stub
		return driver.findElement(ToPrice);
	}

	public WebElement Search() {
		// TODO Auto-generated method stub
		return driver.findElement(Search);
	}

	public WebElement SelectCameraSony() {
		// TODO Auto-generated method stub
		return driver.findElement(SelectCameraSony);
	}

}
