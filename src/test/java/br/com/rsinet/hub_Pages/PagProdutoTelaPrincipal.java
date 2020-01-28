package br.com.rsinet.hub_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PagProdutoTelaPrincipal {
	
WebDriver driver;
	
	@FindBy(how = How.ID, using = "miceImg")
	private WebElement campoMouses;
	
	@FindBy(how = How.ID, using = "30")
	private WebElement campoEscolherMouse;

	/*@FindBy(how = How.ID, using = "tabletsImg")
	private WebElement campoClicarTablet;
	
	@FindBy(how = How.ID, using = "18")
	private WebElement campoEscolherTablet;
	
	@FindBy(how = How.XPATH, using = "\"//*[@id=\\\"productProperties\\\"]/div[2]/e-sec-plus-minus/div/div[3]\"")
	private WebElement campoMaisQuantidade;
	
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement campoAdcionarCarrinho;*/
	
	
	public void clicarMouse () {
		campoMouses.click();
	}
		public void escolherMouses () {
		campoEscolherMouse.click();
		
	
	
}
}