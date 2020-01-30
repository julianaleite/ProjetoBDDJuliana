package br.com.rsinet.hub_stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.utility.DriverFactoryBDD;
import br.com.rsinet.hub_Pages.PagProdutoTelaPrincipal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProdutoTelaPrincipal {

	PagProdutoTelaPrincipal telaproduto;

	public static WebDriver driver;

	@Given("^Carregando os Dados$")
	public void carregando_os_dados() throws Throwable {
		driver = DriverFactoryBDD.getDriver();
	}

	@When("^Clicar no Mouse$")
	public void clicar_no_mouse() throws Throwable {
		telaproduto.clicarMouse();
	}

	@Then("^Escolher Mouse$")
	public void escolher_mouse() throws Throwable {
		telaproduto.escolherMouses();

	}
	@Then("^fechar guia $")
	public void fechar_guia() throws Throwable{
		driver = DriverFactoryBDD.quitDriver();

}
}