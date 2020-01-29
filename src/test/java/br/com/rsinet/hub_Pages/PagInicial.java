package br.com.rsinet.hub_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagInicial {
	
	WebDriver driver;
	
	public PagInicial(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.ID, using = "menuUser")
	private WebElement campoLogin;

	//@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement campoCriarConta;

	public void CriarLogin() {
		campoLogin.click();
	}

	public void criarConta() {
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(campoCriarConta));
		campoCriarConta.sendKeys(Keys.ENTER);;
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(campoCriarConta));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", campoCriarConta);
		
	}
}