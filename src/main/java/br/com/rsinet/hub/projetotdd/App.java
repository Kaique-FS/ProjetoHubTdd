//package br.com.rsinet.hub.projetotdd;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.log4j.Logger;
//import org.apache.log4j.xml.DOMConfigurator;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import br.com.rsinet.hub.projetotdd.actions.Product;
//import br.com.rsinet.hub.projetotdd.actions.Search;
//import br.com.rsinet.hub.projetotdd.pageobjects.HomePage;
//import br.com.rsinet.hub.projetotdd.pageobjects.LogInPage;
//import br.com.rsinet.hub.projetotdd.utility.Constant;
//import br.com.rsinet.hub.projetotdd.utility.Driver;
//import br.com.rsinet.hub.projetotdd.utility.ScreenShot;
//
//public class App {
//   
//	private static WebDriver driver;
//	private static Logger Log = Logger.getLogger("Acao");
//	
//	@Test
//	public void Execute() throws Exception {
//		DOMConfigurator.configure("log4j.xml");
//		
//		HomePage.lnk_MyAccount(driver).click();
//		Log.info("Clicou no botão de login");
//		
//		LogInPage.txtbx_UserName(driver).sendKeys(Constant.Username);
//		Log.info("Inseriu usuario valido");
//		
//		LogInPage.txtbx_Password(driver).sendKeys(Constant.Password);
//		Log.info("Inseriu senha valida");
//
//		LogInPage.btn_LogIn(driver).sendKeys(Keys.ENTER);
//		Log.info("Realizou Login");
//
//		//home
//		Search.btn_Tablet(driver).click();
//		ScreenShot.ScreenShotCapture(driver);
//		Log.info("Clicou em 'Tablets' + print");
//
//		Product.btn_tablet3(driver).click();
//		ScreenShot.ScreenShotCapture(driver);
//		Log.info("escolheu produto + print ");
//
//		Product.btn_color(driver).click();
//		ScreenShot.ScreenShotCapture(driver);
//		Log.info("cor + print");
//
//		Product.btn_addcart(driver).click();
//		ScreenShot.ScreenShotCapture(driver);
//		Log.info("adicionou ao carrinho + print");
//		
//		//lupa
//		Search.btn_LupaSearch(driver).click();
//		ScreenShot.ScreenShotCapture(driver);
//		Log.info("Clica na lupa + print");
//
//		Search.btn_Search(driver).sendKeys(Constant.Product + Keys.ENTER);
//		ScreenShot.ScreenShotCapture(driver);
//		Log.info("Escreve o produto + enter + print");
//		
//		Product.btn_mouse(driver).click();
//		Product.btn_addcart(driver).click();
//		ScreenShot.ScreenShotCapture(driver);
//		Log.info("escolhe o produto indicado + adiciona ao carrinho + print");
//
//		Assert.assertEquals("Tritao", HomePage.txt_username(driver).getText());
//
//	}
//	
//	@BeforeMethod
//	public void inicializa() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaique.silva\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get(Constant.URL);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Log.info("Iniciou o navegador e abriu a pagina");
//	}
//	
//	@AfterMethod
//	public void Finaliza() throws IOException {
//		ScreenShot.ScreenShotCapture(driver);
//		//HomePage.lnk_LogOut(driver).click();
//		//HomePage.lnk_SingOut(driver).click();
//		Driver.closeBrowser(driver);
//		Log.info("Tirou print e fechou navegador");
//	}
//}
