package MercadoLibre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {

	private WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By NewProducts=By.xpath("//a[contains(text(),'Nuevo')]"); 
	By LocationCapFed=By.xpath("//*[@id='id_state']/dd[1]/a");
	By FromPrice=By.id("fromPrice");
	By ToPrice=By.id("toPrice");
	By SearchByPrice=By.xpath("//*[@id='priceForm']/div/button");
	By PickPS4Pro=By.id("MLA655550095");
	By CategoriesBikes=By.xpath("//*[@id='id_category']/dd[1]/h3/a");
	By PickElectricBike=By.xpath("//a[contains(@href,'bicicleta-electrica-bh-easymotion-neo-prox-envio')]");
	
	
	public WebElement NewProducts() {
		// TODO Auto-generated method stub
		return driver.findElement(NewProducts);
	}
	public WebElement LocationCapFed() {
		// TODO Auto-generated method stub
		return driver.findElement(LocationCapFed);
	}
	
	public WebElement FromPrice() {
		// TODO Auto-generated method stub
		return driver.findElement(FromPrice);
	}
	
	public WebElement ToPrice() {
		// TODO Auto-generated method stub
		return driver.findElement(ToPrice);
	}
	
	public WebElement SearchByPrice() {
		// TODO Auto-generated method stub
		return driver.findElement(SearchByPrice);
	}
	public WebElement PickPS4Pro() {
		// TODO Auto-generated method stub
		return driver.findElement(PickPS4Pro);
	}
	public WebElement CategoriesBikes() {
		// TODO Auto-generated method stub
		return driver.findElement(CategoriesBikes);
	}
	public WebElement PickElectricBike() {
		// TODO Auto-generated method stub
		return driver.findElement(PickElectricBike);
	}
	public boolean NotFoundBikesByPrice() {
		// TODO Auto-generated method stub
		WebElement mlnoresultsfound = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/h3")); 
		String ValidationNoResultsFound="En esta categoría no hay publicaciones que coincidan con tu búsqueda.";
	    System.out.println("Not found bikes by price.");
		return mlnoresultsfound.getText().contains(ValidationNoResultsFound);
	}
	
	
	 
	
	
}
