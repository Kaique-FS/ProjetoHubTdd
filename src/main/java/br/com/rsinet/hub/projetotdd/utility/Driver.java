package br.com.rsinet.hub.projetotdd.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;

	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaique.silva\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		return driver;
	}

	public static void closeBrowser(WebDriver driver) {

		if (driver != null) {
			driver.close();
		}

	}
}
