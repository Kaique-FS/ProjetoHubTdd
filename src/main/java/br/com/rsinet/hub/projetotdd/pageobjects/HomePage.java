package br.com.rsinet.hub.projetotdd.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	public static String cmpArmazenado;
	private static WebElement element = null;

	public static WebElement btn_OurProducts(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("/html/body/header/nav/ul/li[8]/a"));
		System.out.println("clique em 'nossos produtos' ");
		return element;
	}
	
	public static WebElement btn_SpecialOffer(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("/html/body/header/nav/ul/li[7]/a"));
		System.out.println("clique em 'Ofertas Especiais' ");
		return element;
	}
	
	public static WebElement btn_PopularItems(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("/html/body/header/nav/ul/li[6]/a"));
		System.out.println("clique em 'Items Populares' ");
		return element;
	}
	
	public static WebElement btn_ContactUs(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("/html/body/header/nav/ul/li[5]/a"));
		System.out.println("clique em 'Contate nos' ");
		return element;
	}
	
	public static WebElement btn_Pesquisa(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.id("menuSearch"));
		System.out.println("clique em 'Pesquisa' ");
		return element;
	}
	
	public static WebElement txtbx_CampoDePesquisa(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.id("autoComplete"));
		System.out.println("clique no campo 'Pesquisa' ");
		return element;
	}
	
	public static WebElement btn_Login(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.id("menuUserLink"));
		System.out.println("clica em login");
		return element;
	}
	
	public static WebElement btn_NovoUsuario(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
		System.out.println("clica em novo usuario");
		return element;
	}
	
	public static WebElement btn_Product1(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.id("details_16"));
		System.out.println("clica em novo usuario");
		return element;
	}
	
	public static WebElement btn_Product2(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.id("details_10"));
		System.out.println("clica em novo usuario");
		return element;
	}
	
	public static WebElement btn_Product3(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.id("details_21"));
		System.out.println("clica em novo usuario");
		return element;
	}

	public static WebElement lnk_LogOut(WebDriver driver) {
		element = driver.findElement(By.id("menuUserLink"));
		// element =
		// driver.findElement(By.xpath("//*[@id=\'loginMiniTitle\']/label[3]"));
		System.out.println("Clicou no Boneco");
		return element;
	}

	public static WebElement lnk_SingOut(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\'loginMiniTitle\']/label[3]"));
		System.out.println("Saiu");
		return element;
	}

	public static WebElement txt_username(WebDriver driver) {
		//element = driver.findElement(By.id("menuUserLink"));
		element = driver.findElement(By.xpath(".//*[@class='hi-user containMiniTitle ng-binding']"));
		System.out.println("Nome do Usuario");
		return element;
	}
	
	public static WebElement btn_explorenow(WebDriver driver) {
		element = driver.findElement(By.name("explore_now_btn"));
		System.out.println("Nome do Usuario");
		return element;
	}
	
	public static WebElement btn_circle(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\'slider_explore_now\']/div/div[2]/span[2]"));
		System.out.println("Nome do Usuario");
		return element;
	}
	
}
