package br.com.rsinet.hub.projetotdd.testes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub.projetotdd.actions.Product;
import br.com.rsinet.hub.projetotdd.actions.SearchLupa;
import br.com.rsinet.hub.projetotdd.pageobjects.HomePage;
import br.com.rsinet.hub.projetotdd.pageobjects.LogInPage;
import br.com.rsinet.hub.projetotdd.utility.Constant;

public class SearchProductLupa {

private static WebDriver driver;
	
	@BeforeMethod
	public void inicializa() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaique.silva\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void Execute() throws InterruptedException {
		HomePage.lnk_MyAccount(driver).click();
		LogInPage.txtbx_UserName(driver).sendKeys(Constant.Username);
		LogInPage.txtbx_Password(driver).sendKeys(Constant.Password);
		LogInPage.btn_LogIn(driver).sendKeys(Keys.ENTER);
		//Lupa
		SearchLupa.btn_lupa(driver).click();
		SearchLupa.txt_pesquisa(driver).sendKeys(Constant.Product + Keys.ENTER);
		Product.btn_mouse(driver).click();
		Product.btn_addcart(driver).click();
	}
}
