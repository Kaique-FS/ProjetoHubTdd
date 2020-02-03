package br.com.rsinet.hub.projetotdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	private static WebElement element = null;

	public static WebElement txtbx_NomeProduto(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\\'Description\\']/h1"));
		System.out.println("Nome do produto" + element);
		return element;
	}
	
	public static WebElement btn_AddToCart(WebDriver driver) {
		element = driver.findElement(By.xpath("save_to_cart"));
		System.out.println("Adiciona ao Carrinho");
		return element;
	}
}