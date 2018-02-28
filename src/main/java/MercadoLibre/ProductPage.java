package MercadoLibre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	public WebDriver driver;

	public ProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By SeePic2=By.xpath("//*[@id='gallery_dflt']/div/label[2]"); 
//	By NextPic=By.xpath("//*[@id='productGalleryCollection']/span[2]/svg");
	By IncrementQuantityBtn=By.id("stockQtyIncrease");
	By BidButtonTop=By.id("BidButtonTop");	
			
	public WebElement SeePic2() {
		// TODO Auto-generated method stub
		return driver.findElement(SeePic2);
	}

//	public WebElement NextPic() {
//		// TODO Auto-generated method stub
//		return driver.findElement(NextPic);
//	}

	public WebElement IncrementQuantityBtn() {
		// TODO Auto-generated method stub
		return driver.findElement(IncrementQuantityBtn);
	}

	public boolean  BrindaBuenaAtencion() {
		WebElement mlbrindabuenaatencion = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div[1]/section[2]/div[3]/dl/dd[2]/span")); 
		String ValidacionBrindaBuenaAtencion="Brinda buena atención";
	    System.out.println("The seller is MercadoLíder Platinum.");
		return mlbrindabuenaatencion.getText().contains(ValidacionBrindaBuenaAtencion);
	}
	
	public boolean  SuperOffer() {
		WebElement mlsuperoferta = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/section[3]/div/div"));
		String ValidacionSuperOferta="SUPER OFERTA HASTA AGOTAR STOCK";
	    System.out.println("The product is an super offer until stock out.");
		return mlsuperoferta.getText().contains(ValidacionSuperOferta);
	}

	public WebElement BidButtonTop() {
		// TODO Auto-generated method stub
		return driver.findElement(BidButtonTop);
	}

	public WebElement Pic2Bikes() {
		// TODO Auto-generated method stub
		return null;
	}

}
