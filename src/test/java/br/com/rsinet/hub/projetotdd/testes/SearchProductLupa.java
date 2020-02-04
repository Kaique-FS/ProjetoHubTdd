package br.com.rsinet.hub.projetotdd.testes;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub.projetotdd.pageobjects.CartPage;
import br.com.rsinet.hub.projetotdd.pageobjects.HomePage;
import br.com.rsinet.hub.projetotdd.pageobjects.ProductPage;
import br.com.rsinet.hub.projetotdd.utility.Constant;
import br.com.rsinet.hub.projetotdd.utility.Driver;
import br.com.rsinet.hub.projetotdd.utility.ScreenShot;

public class SearchProductLupa {

	private static WebDriver driver;
	private static Logger Log = Logger.getLogger("Acao");
	

	@BeforeMethod
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaique.silva\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Iniciou o navegador e abriu a pagina");
	}

	@Test
	public void Execute() throws Exception {
		DOMConfigurator.configure("log4j.xml");

		HomePage.btn_Pesquisa(driver).click();
		ScreenShot.ScreenShotCapture(driver);
		Log.info("Clica na lupa + print");
		
		HomePage.txtbx_CampoDePesquisa(driver).sendKeys(Constant.Product + Keys.ENTER);
		HomePage.btn_FechaPopUp(driver).click();
		ScreenShot.ScreenShotCapture(driver);
		Log.info("Escreve o produto + enter + print");

		ProductPage.btn_mouse(driver).click();
		ProductPage.btn_AddToCart(driver).sendKeys(Keys.ENTER);
		ScreenShot.ScreenShotCapture(driver);
		Log.info("escolhe o produto indicado + adiciona ao carrinho + print");

		CartPage.btn_Cart(driver).click();

		Assert.assertTrue(CartPage.btn_Cart(driver).isDisplayed());
	}

	@AfterMethod
	public void Finaliza() throws Exception {
		ScreenShot.ScreenShotCapture(driver);
		Driver.closeBrowser(driver);
		Log.info("Tirou print e fechou navegador");
	}
}
