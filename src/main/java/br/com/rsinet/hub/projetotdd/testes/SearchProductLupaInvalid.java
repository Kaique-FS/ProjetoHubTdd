package br.com.rsinet.hub.projetotdd.testes;

import java.io.IOException;
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

import br.com.rsinet.hub.projetotdd.actions.SearchLupa;
import br.com.rsinet.hub.projetotdd.utility.Constant;
import br.com.rsinet.hub.projetotdd.utility.Driver;
import br.com.rsinet.hub.projetotdd.utility.ScreenShot;

public class SearchProductLupaInvalid {

	private static WebDriver driver;
	private static Logger Log = Logger.getLogger("Acao");

	@BeforeMethod
	public void inicializa() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\kaique.silva\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void Execute() throws Exception {
		DOMConfigurator.configure("log4j.xml");

		SearchLupa.btn_lupa(driver).click();
		ScreenShot.ScreenShotCapture(driver);
		Log.info("Clica na lupa + print");

		SearchLupa.txt_pesquisa(driver).sendKeys(Constant.ProductInvalid + Keys.ENTER);
		SearchLupa.btn_closepopup(driver).click();
		ScreenShot.ScreenShotCapture(driver);
		Log.info("Escreve o produto + enter + print");

		Assert.assertEquals(Constant.ProductInvalid, "Biscoito");
	}

	@AfterMethod
	public void Finaliza() throws IOException {
		ScreenShot.ScreenShotCapture(driver);
		Driver.closeBrowser(driver);
		Log.info("Tirou print e fechou navegador");
	}
}
