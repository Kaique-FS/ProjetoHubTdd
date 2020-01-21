package br.com.rsinet.hub.projetotdd.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static String cmpArmazenado;
	private static WebElement element = null;

	public static WebElement lnk_MyAccount(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.id("menuUserLink"));
		System.out.println("clique no login/cadastro");
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
