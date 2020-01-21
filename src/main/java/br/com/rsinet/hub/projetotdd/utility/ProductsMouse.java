package br.com.rsinet.hub.projetotdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsMouse {

	private static WebElement element = null;
	
	public static WebElement btn_mouse1(WebDriver driver) {
		element = driver.findElement(By.linkText("HP USB 3 Button Optical Mouse"));
		System.out.println("Mouse 1");
		return element;
	}
	
	public static WebElement btn_mouse2(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Z3200 Wireless Mouse"));
		System.out.println("Mouse 2");
		return element;
	}
	
	public static WebElement btn_mouse3(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Z3600 Wireless Mouse"));
		System.out.println("Mouse 3");
		return element;
	}
	
	public static WebElement btn_mouse4(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Z4000 Wireless Mouse"));
		System.out.println("Mouse 4");
		return element;
	}
	
	public static WebElement btn_mouse5(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Z8000 Bluetooth Mouse"));
		System.out.println("Mouse 5");
		return element;
	}
	
	public static WebElement btn_mouse6(WebDriver driver) {
		element = driver.findElement(By.linkText("Microsoft Sculpt Touch Mouse"));
		System.out.println("Mouse 6");
		return element;
	}
}
