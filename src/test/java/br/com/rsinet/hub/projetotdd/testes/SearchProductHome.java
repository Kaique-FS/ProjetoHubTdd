package br.com.rsinet.hub.projetotdd.testes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub.projetotdd.pageobjects.CartPage;
import br.com.rsinet.hub.projetotdd.pageobjects.ProductPage;
import br.com.rsinet.hub.projetotdd.pageobjects.SearchPage;
import br.com.rsinet.hub.projetotdd.utility.Constant;
import br.com.rsinet.hub.projetotdd.utility.Driver;
import br.com.rsinet.hub.projetotdd.utility.ScreenShot;


public class SearchProductHome {

	private static WebDriver driver;
	private static Logger Log = Logger.getLogger("Acao");
	
	@Test
	public void Execute() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		
		SearchPage.btn_Tablets(driver).click();
		ScreenShot.ScreenShotCapture(driver);
		Log.info("Clicou em 'Tablets' + print");

		ProductPage.btn_Tablet3(driver).click();
		ScreenShot.ScreenShotCapture(driver);
		Log.info("escolheu produto + print ");

		ProductPage.btn_AddToCart(driver).click();
		ScreenShot.ScreenShotCapture(driver);
		Log.info("adicionou ao carrinho + print");

		CartPage.btn_Cart(driver).click();
		
		Assert.assertTrue(CartPage.btn_Cart(driver).isDisplayed());

	}
	
	@BeforeMethod
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaique.silva\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Iniciou o navegador e abriu a pagina");
	}
	
	@AfterMethod
	public void Finaliza() throws IOException {
		ScreenShot.ScreenShotCapture(driver);
		Driver.closeBrowser(driver);
		Log.info("Tirou print e fechou navegador");
	}
}
