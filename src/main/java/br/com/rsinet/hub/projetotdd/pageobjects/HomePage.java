package br.com.rsinet.hub.projetotdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	public static String cmpArmazenado;
	private static WebElement element = null;
	
	public static WebElement btn_OurProducts(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/header/nav/ul/li[8]/a"));
		System.out.println("clique em 'nossos produtos' ");
		return element;
	}
	
	public static WebElement btn_SpecialOffer(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/header/nav/ul/li[7]/a"));
		System.out.println("clique em 'Ofertas Especiais' ");
		return element;
	}
	
	public static WebElement btn_PopularItems(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/header/nav/ul/li[6]/a"));
		System.out.println("clique em 'Items Populares' ");
		return element;
	}
	
	public static WebElement btn_ContactUs(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/header/nav/ul/li[5]/a"));
		System.out.println("clique em 'Contate nos' ");
		return element;
	}
	
	public static WebElement btn_Pesquisa(WebDriver driver) throws InterruptedException  {
		/*
		 * Não foi possivel utilizar um wait "comum". 
		 */
		Thread.sleep(5000);
		element = driver.findElement(By.id("menuSearch"));
		System.out.println("clique em 'Pesquisa' ");
		return element;
	}
	
	public static WebElement txtbx_CampoDePesquisa(WebDriver driver) {
		element = driver.findElement(By.id("autoComplete"));
		System.out.println("clique no campo 'Pesquisa' ");
		return element;
	}
	
	public static WebElement btn_FechaPopUp(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\'search\']/div/div"));
		System.out.println("Fechou pop-up");
		return element;
	}
	
	public static WebElement btn_Login(WebDriver driver) {
		element = driver.findElement(By.id("menuUserLink"));
		System.out.println("clica em login");
		return element;
	}
	
	public static WebElement btn_NovoUsuario(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
		System.out.println("clica em novo usuario");
		return element;
	}
	
	public static WebElement btn_Product1(WebDriver driver) {
		element = driver.findElement(By.id("details_16"));
		System.out.println("clica em novo usuario");
		return element;
	}
	
	public static WebElement btn_Product2(WebDriver driver) {
		element = driver.findElement(By.id("details_10"));
		System.out.println("clica em novo usuario");
		return element;
	}
	
	public static WebElement btn_Product3(WebDriver driver) {
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
