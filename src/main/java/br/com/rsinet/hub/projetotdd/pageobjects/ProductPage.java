package br.com.rsinet.hub.projetotdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	private static WebElement element = null;

	public static WebElement txtbx_NomeProduto(WebDriver driver) {
		element = driver.findElement(By.id("//*[@id=\\'Description\\']/h1"));
		System.out.println("Nome do produto" + element);
		return element;
	}
	
	public static WebElement btn_AddToCart(WebDriver driver) {
		element = driver.findElement(By.name("save_to_cart"));
		System.out.println("Adiciona ao Carrinho");
		return element;
	}
	
	public static WebElement btn_Tablet3(WebDriver driver) {
		element = driver.findElement(By.id("18"));
		System.out.println("Clica no 3 produto");
		return element;
	}

	public static WebElement btn_mouse(WebDriver driver) {
		element = driver.findElement(By.id("28"));
		System.out.println("Clica no 2 mouse");
		return element;
	}
	
}