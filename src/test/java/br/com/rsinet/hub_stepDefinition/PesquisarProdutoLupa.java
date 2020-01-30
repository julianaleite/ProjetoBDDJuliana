package br.com.rsinet.hub_stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub.utility.DriverFactoryBDD;
import br.com.rsinet.hub_Pages.PagInicial;
import br.com.rsinet.hub_Pages.PagPesquisa;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PesquisarProdutoLupa {

	PagPesquisa telapesquisa;

	public static WebDriver driver;

	@Given("^Carrega driverfactory$")
	public void carregar_driverfactory() throws Throwable {
		driver = DriverFactoryBDD.getDriver();
		telapesquisa = PageFactory.initElements(driver, PagPesquisa.class);
	}

	@When("^Clicar na Lupa$")
	public void clicar_na_lupa() throws Throwable {
		telapesquisa.ClicarLupa();
	}

	@And("^Escrever na lupa$")
	public void escrever_na_lupa() throws Throwable {
		telapesquisa.EscreverProduto();
	}

	@Then("^Produto Escolhido$")
	public void produto_escolhido() throws Throwable {
		telapesquisa.ProdutoEscolhido();
	}
		@Then("^fechar guia page $")
		public void fechar_guia_page() throws Throwable{
			driver = DriverFactoryBDD.quitDriver();
		
	}
}