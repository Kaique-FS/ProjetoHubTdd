package br.com.rsinet.hub.projetotdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	private static WebElement element = null;

	public static WebElement btn_Speakers(WebDriver driver) {
		element = driver.findElement(By.id("speakersImg"));
		System.out.println("Clica em 'Speakers' ");
		return element;
	}
	
	public static WebElement btn_Tablets(WebDriver driver) {
		element = driver.findElement(By.id("tabletsImg"));
		System.out.println("Clica em 'Tablets' ");
		return element;
	}
	
	public static WebElement btn_Laptops(WebDriver driver) {
		element = driver.findElement(By.id("laptopsImg"));
		System.out.println("Clica em 'Laptos' ");
		return element;
	}
	
	public static WebElement btn_Mice(WebDriver driver) {
		element = driver.findElement(By.id("miceImg"));
		System.out.println("Clica em 'Mices' ");
		return element;
	}
	
	public static WebElement btn_Headphones(WebDriver driver) {
		element = driver.findElement(By.id("headphonesImg"));
		System.out.println("Clica em 'Headphones' ");
		return element;
	}
	
}