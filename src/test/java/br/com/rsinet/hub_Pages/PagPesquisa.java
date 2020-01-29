package br.com.rsinet.hub_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagPesquisa {

	
	WebDriver driver;
	
	
	public void  pagPesquisa (WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
@FindBy(how = How.ID, using = "menuUser")
private WebElement campoclicarnalupa;

@FindBy(how = How.ID, using = "autoComplete")
private WebElement campoescrevernalupa;

@FindBy(how = How.CLASS_NAME, using = "imgProduct")
private WebElement campoprodutoescolhido;




public void ClicarLupa () {
	campoclicarnalupa.click();
}

public void EscreverProduto() {
	campoescrevernalupa.click();
}
public void ProdutoEscolhido() {
	campoprodutoescolhido.click();
}
}