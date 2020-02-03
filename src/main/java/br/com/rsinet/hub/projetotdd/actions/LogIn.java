package br.com.rsinet.hub.projetotdd.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub.projetotdd.pageobjects.HomePage;
import br.com.rsinet.hub.projetotdd.pageobjects.LogInPage;
import br.com.rsinet.hub.projetotdd.utility.Constant;

public class LogIn {

private static WebDriver driver;
	
	@BeforeMethod
	public void inicializa() {
		driver = new ChromeDriver();
		driver.get(Constant.URL);
	}
	
	@Test
	public void Execute() {
		HomePage.btn_Login(driver).click();
		LogInPage.txtbx_UserName(driver).sendKeys(Constant.Username);
		LogInPage.txtbx_Password(driver).sendKeys(Constant.Password);
		LogInPage.btn_LogIn(driver).sendKeys(Keys.ENTER);
	}
}
