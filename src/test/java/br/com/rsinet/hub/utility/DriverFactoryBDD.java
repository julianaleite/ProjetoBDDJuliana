package br.com.rsinet.hub.utility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactoryBDD {

		private static WebDriver driver;

		public static WebDriver getDriver() {

			if (driver == null) {
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.advantageonlineshopping.com");
				driver.manage().window().maximize();
			}

			return driver;
		}
	

public static WebDriver quitDriver() {

	// Checa se o driver existe antes de destruir.

	if (driver != null) {
		driver.quit();
		driver = null;
	}
	return driver;
}

}
