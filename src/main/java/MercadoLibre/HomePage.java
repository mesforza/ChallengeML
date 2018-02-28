package MercadoLibre;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomePage {

	
	public WebDriver driver;
	
	By Nationality=By.id("AR");
	By Login=By.xpath("//*[@id='nav-header-menu']/a[2]");
	By username=By.id("user_id");
	By continueButton=By.xpath("//*[@id='login_user_form']/div[2]/input");
	By password=By.id("password");
	By loginButton=By.xpath("//*[@id='action-complete']");
	By TiendaOficial=By.xpath("/html/body/header/div/div[2]/div/ul/li[3]/a");
	By NavSearch=By.xpath("/html/body/header/div/form/input");
	By NavSearchButton=By.className("nav-search-btn");
	By OptionHelp=By.xpath("//*[@id='nav-header-menu']/a[3]");
	By MoreInformation=By.xpath("/html/body/div[2]/label");
	By MyProfile=By.xpath("//*[@id='nav-header-menu']/div/label/a");
	By MyAccount=By.xpath("//a[contains(@href,'ar/summary')]");
	By SportsClick=By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/div[14]/h2/a");	
	By Categories=By.className("nav-menu-categories-link");
	By BikesCyclingClick=By.xpath("//a[contains(@href,'/bicicletas-ciclismo')]");
			
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement Nationality() {
		// TODO Auto-generated method stub
		return driver.findElement(Nationality);
	}


	public WebElement Login() {
		// TODO Auto-generated method stub
		return driver.findElement(Login);
	}


	public WebElement TiendaOficial() {
		// TODO Auto-generated method stub
		return driver.findElement(TiendaOficial);
	}


	public WebElement NavSearch() {
		// TODO Auto-generated method stub
		return driver.findElement(NavSearch);
	}


	public WebElement NavSearchButton() {
		// TODO Auto-generated method stub
		return driver.findElement(NavSearchButton);
	}


	public WebElement OptionHelp() {
		// TODO Auto-generated method stub
		return driver.findElement(OptionHelp);
	}

	
	public void CategoriesMouseHoverActions() throws Exception{
		
	//Mouse hover con Actions
        for(int i=0;i<60;i++){
            try{
                driver.findElement(By.className("nav-menu-categories-link")).isDisplayed();
        		WebElement categories= driver.findElement(By.className("nav-menu-categories-link"));
        		Actions act = new Actions(driver);
        		act.moveToElement(categories,0,0).build().perform();
        		break;
            }catch(Exception e){Thread.sleep(2000);

            }   
        }
	}
	
public void CategoriesMouseHoverJavaScript() throws Exception{
		// Mouse hover con JavaScript
		WebElement element =driver.findElement(By.className("nav-menu-categories-link"));
		String strJavaScript = "var element = arguments[0];"
	            + "var mouseEventObj = document.createEvent('MouseEvents');"
	            + "mouseEventObj.initEvent( 'mouseover', true, true );"
	            + "element.dispatchEvent(mouseEventObj);";
	     JavascriptExecutor js =  (JavascriptExecutor) driver;
	     js.executeScript(strJavaScript, element);

		
	}


public void CategoriesClick() throws Exception{
	
	//Click en 'Categorías'
	for(int i=0;i<60;i++){
        try{
            driver.findElement(By.className("nav-menu-categories-link")).isDisplayed();
    		WebElement categories= driver.findElement(By.className("nav-menu-categories-link"));
    		Actions act = new Actions(driver);
    		act.moveToElement(categories,0,0).click().build().perform();
    		break;
        }catch(Exception e){Thread.sleep(2000);

        }   
	}
}
	

	public void Sports() {
		// TODO Auto-generated method stub
		
		//Hover 'Categorías > sport'
		Actions act = new Actions(driver);
		WebElement sports= driver.findElement(By.xpath("//a[contains(text(),'Deportes y Aire Libre')]"));
		act.moveToElement(sports).perform();
		
	}
	

	public void BikesCycling() {
		// TODO Auto-generated method stub
		
		//Hover 'Categorías > sport > Bikes an Cycling'
		Actions act = new Actions(driver);
		WebElement bikes= driver.findElement(By.xpath("//a[contains(text(),'Bicicletas y Ciclismo')]"));
		act.moveToElement(bikes).click().perform();
		
	}
	
	
	public WebElement MyProfile() {
		// TODO Auto-generated method stub
		return driver.findElement(MyProfile);
	}

	public WebElement MoreInformation() {
		// TODO Auto-generated method stub
		return driver.findElement(MoreInformation);
	}


	public void CountLinksInformation() {
		// TODO Auto-generated method stub
		WebElement countlinksinformation=driver.findElement(By.xpath("/html/body/div[2]/div/div"));
		System.out.println(countlinksinformation.findElements(By.tagName("a")).size());
	}


	public void MercadoPago() 
	{
		// TODO Auto-generated method stub
		WebElement containsmercadopago=driver.findElement(By.xpath("/html/body/div[2]/div/div"));
		String Beforeclicking = null;
		String Afterclicking;
		for(int i=0;i<containsmercadopago.findElements(By.tagName("a")).size();i++)
		{
		
			
			if(containsmercadopago.findElements(By.tagName("a")).get(i).getText().contains("Mercado Pago"))
			{
				Beforeclicking = driver.getTitle();
			
				containsmercadopago.findElements(By.tagName("a")).get(i).click();
				break;
				}
		}
			Afterclicking =driver.getTitle();
			if(Beforeclicking!=Afterclicking)
			{
				if(driver.getPageSource().contains("Mercado Pago"))

					System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
		}


//	public WebElement MyAccount() {
//		// TODO Auto-generated method stub
//		return driver.findElement(MyAccount);
//	}

	public void MyAccount() {
		// TODO Auto-generated method stub
		Actions act = new Actions(driver);
		WebElement myaccount= driver.findElement(By.xpath("//a[contains(@href,'ar/summary')]"));
		act.moveToElement(myaccount).click().perform();
		
	}


	public WebElement SportsClick() {
		// TODO Auto-generated method stub
		return driver.findElement(SportsClick);
	}


	public WebElement BikesCyclingClick() {
		// TODO Auto-generated method stub
		return driver.findElement(BikesCyclingClick);
	}

}
	
	
