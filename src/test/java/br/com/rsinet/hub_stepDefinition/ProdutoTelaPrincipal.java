package br.com.rsinet.hub_stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.utility.DriverFactoryBDD;
import br.com.rsinet.hub_Pages.PagCadastro;
import br.com.rsinet.hub_Pages.PagInicial;
import br.com.rsinet.hub_Pages.PagProdutoTelaPrincipal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProdutoTelaPrincipal {

	PagProdutoTelaPrincipal telaproduto;
	
	public static WebDriver driver;
	
	

	@Given("^Carregamento dos dados$")
		public void user_is_on_Home_Page() throws Throwable {
			driver = DriverFactoryBDD.getDriver();
		}
		@When("^Clicar no Mouse$")
		public void clicar_no_mouse () throws Throwable {
			telaproduto.clicarMouse();
			
		}
}
