package br.com.rsinet.hub.projetotdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {

	private static WebElement element = null;

	public static WebElement btn_cart(WebDriver driver){
		element = driver.findElement(By.id("menuCart"));
		System.out.println("Clicou no carrinho");
		return element;
	}
	
	public static WebElement txt_productcart(WebDriver driver){
		element = driver.findElement(By.className("roboto-regular productName ng-binding"));
		System.out.println("Produto no Carrinho");
		return element;
	}
	
}
