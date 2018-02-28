package MercadoLibre;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HelpPage {

	public WebDriver driver;

	public HelpPage(WebDriver driver) {
		this.driver=driver;
	}

	By HelpOptions=By.xpath("//a[contains(@href,'/ayuda/Vendiendo_643')]");
	By Publication=By.xpath("/html/body/main/main/div/div[1]/div/div/div[2]/article/div/ul/li[1]/a/h3");
	By GoodPublishing=By.xpath("/html/body/main/main/div/div[1]/div/div/div[2]/article/div/ul/li[1]/a/h3");
	By TakeGoodPhotos=By.xpath("//a[contains(@href,'/ayuda/Sacar-buenas-fotos_803')]");
	By TakeGoodPhotosProducts=By.xpath("//a[contains(@href,'/ayuda/Sacar-buenas-fotos-productos_805')]");
	By SearchInput=By.id("search");
	By SearchButton=By.xpath("//*[@id='form-search']/button[2]");
	By ChooseSeller=By.xpath("//a[contains(@href,'/ayuda/Como-elegir-a-que-vendedor-comprarle_640')]");
	By Recomendation3=By.xpath("/html/body/main/main/div/div[1]/div/div/div[2]/article/div[1]/div[2]/h2");
	By Recomendation4=By.xpath("/html/body/main/main/div/div[1]/div/div/div[2]/article/div[1]/div[8]/h2");

	
	public WebElement Selling() {
		// TODO Auto-generated method stub
		return driver.findElement(HelpOptions);
	}

	public WebElement Publication() {
		// TODO Auto-generated method stub
		return driver.findElement(Publication);
	}

	public WebElement GoodPublishing() {
		// TODO Auto-generated method stub
		return driver.findElement(GoodPublishing);
	}

	public WebElement TakeGoodPhotos() {
		// TODO Auto-generated method stub
		return driver.findElement(TakeGoodPhotos);
	}

	public WebElement TakeGoodPhotosProducts() {
		// TODO Auto-generated method stub
		return driver.findElement(TakeGoodPhotosProducts);
	}

	public boolean ProductRecomendation1() {
		// TODO Auto-generated method stub
		WebElement mlproductrecomendation = driver.findElement(By.xpath("/html/body/main/main/div/div[1]/div/div/div[2]/article/div[1]/div[1]/h2"));
		String ValidationProductRecomendation="Solo fondo blanco";
	    System.out.println("The product with white background.");
		return mlproductrecomendation.getText().contains(ValidationProductRecomendation);
	}
	
	public boolean ProductRecomendation2() {
		// TODO Auto-generated method stub
		WebElement mlproductrecomendation = driver.findElement(By.xpath("/html/body/main/main/div/div[1]/div/div/div[2]/article/div[1]/div[3]/h2"));
		String ValidationProductRecomendation="Sin logos ni marcas de agua";
		System.out.println("The product without watermark.");
		return mlproductrecomendation.getText().contains(ValidationProductRecomendation);
	}

	public void ProductRecomendation3() {
		// TODO Auto-generated method stub
		WebElement mlproductrecomendation =driver.findElement(Recomendation3);
		Assert.assertEquals(mlproductrecomendation.getText(),"Solo el producto, sin bordes");
		System.out.println("The product without edge.");
	}

	public void ProductRecomendation4() {
		// TODO Auto-generated method stub
		WebElement mlproductrecomendation =driver.findElement(Recomendation4);
		Assert.assertEquals(mlproductrecomendation.getText(),"¡Empieza a sacar fotos increíbles!");
		System.out.println("Start taking amazing photos.");
	}

	
	private Object getTextValue(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement SearchInput() {
		// TODO Auto-generated method stub
		return driver.findElement(SearchInput);
	}

	public WebElement SearchButton() {
		// TODO Auto-generated method stub
		return driver.findElement(SearchButton);
	}

	public WebElement ChooseSeller() {
		// TODO Auto-generated method stub
		return driver.findElement(ChooseSeller);
	}

	public boolean  GoldMedal() {
		WebElement mlgoldmedal = driver.findElement(By.xpath("/html/body/main/main/div/div[1]/div/div/div[2]/article/div[1]/div[1]/div[2]/p[1]/strong"));
		String ValidacionGoldMedal="Si hay medalla, mucho mejor";
	    System.out.println("The seller must be a gold medal.");
		return mlgoldmedal.getText().contains(ValidacionGoldMedal);
	}

	

	
}
