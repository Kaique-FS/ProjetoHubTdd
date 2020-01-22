package br.com.rsinet.hub.projetotdd.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product {

	private static WebElement element = null;

	public static WebElement btn_tablet3(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Pro Tablet 608 G1"));
		System.out.println("Clicou no produto");
		return element;
	}
	
	public static WebElement btn_mouse(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		element = driver.findElement(By.linkText("HP Z3200 Wireless Mouse"));
		System.out.println("Clicou no produto");
		return element;
	}
	
	public static WebElement btn_color(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"rabbit\"]"));
		System.out.println("Clicou na outra cor");
		return element;
	}
	
	public static WebElement btn_addcart(WebDriver driver){
		element = driver.findElement(By.name("save_to_cart"));
		System.out.println("Adicionou no carrinho");
		return element;
	}
	
	public static WebElement btn_not(WebDriver driver) {
		element = driver.findElement(By.id("details_10"));
		System.out.println("Adicionou no carrinho");
		return element;
	}
	
	public static WebElement btn_popularitems(WebDriver driver) {
		element = driver.findElement(By.linkText("POPULAR ITEMS"));
		System.out.println("Adicionou no carrinho");
		return element;
	}
	
	
}
