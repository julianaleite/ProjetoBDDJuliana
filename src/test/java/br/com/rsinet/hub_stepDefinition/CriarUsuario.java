package br.com.rsinet.hub_stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub.utility.DriverFactoryBDD;
import br.com.rsinet.hub_Pages.PagCadastro;
import br.com.rsinet.hub_Pages.PagInicial;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CriarUsuario {

	PagCadastro telacadastro;
	PagInicial telalogin;
	

	public static WebDriver driver;

	@Given("^Carrega os dados$")
	public void carrega_os_dados() throws Throwable {
		driver = DriverFactoryBDD.getDriver();
		telalogin = PageFactory.initElements(driver, PagInicial.class);
		telacadastro = PageFactory.initElements(driver, PagCadastro.class);
	}

	@When("^Usuario Navegue para pagina Login$")
	public void usuario_navegue_para_pagina_login() throws Throwable {
		telalogin.CriarLogin();
	}

	@And("^Usuario crie uma conta$")
	public void criar_Conta() throws Throwable {
		telalogin.criarConta();

	}

	@And("^Digite seu nome$")
	public void digite_seu_nome() throws Throwable {
		String nome = "Andressa";
		telacadastro.digitaNome(nome);

	}

	@And("^Digite seu email$")
	public void digite_seu_email() throws Throwable {
		String email = "Andressa.silva@teste.com.br";
		telacadastro.digitaEmail(email);

	}

	@And("^Digite sua senha senha$")
	public void digite_sua_senha_senha() throws Throwable {
		String senha = "1213Ju";
		telacadastro.digitaSenha(senha);
	}

	@And("^Confirmar sua senha$")
	public void confirmar_sua_senha() throws Throwable {
		String confirSenha = "1213Ju";
		telacadastro.confirmarSenha(confirSenha);
	}

	@And("^Digite Primeiro Nome$")
	public void digite_seu_Primeiro_Nome() throws Throwable {
		String primeiroNome = "Andressa";
		telacadastro.digitaPrimeiroNome(primeiroNome);
	}

	@And("^Digite Segundo Nome$")
	public void digite_seu_Segundo_Nome() throws Throwable {
		String segundoNome = "Silva";
		telacadastro.digitaSegundoNome(segundoNome);
	}

	@And("^Digite seu Telefone$")
	public void digite_seu_Telefone() throws Throwable {
		String telefone = "987654321";
		telacadastro.digitaTelefone(telefone);
	}

	@And("^Escolher Pais$")
	public void escolher_Pais() throws Throwable {
		String pais = "Brazil";
		telacadastro.escolherPais(pais);
	}

	@And("^Digite sua Cidade$")
	public void digite_sua_Cidade() throws Throwable {
		String cidade = "Barueri";
		telacadastro.digitarCidade(cidade);
	}

	@And("^Digite O Endereco$")
	public void digite_seu_Endereco() throws Throwable {
		String endereco = "Rua mar do teste";
		telacadastro.digitandereco(endereco);
	}

	@And("^Digite Codigo Postal$")
	public void digite_Codigo_Postal() throws Throwable {
		String codigo = "654321";
		telacadastro.digitaCodigoPostal(codigo);
	}

	@And("^Clique no Botao Permitir Oferta$")
	public void clique_no_Botao_Permitir_Oferta() throws Throwable {
		telacadastro.permitirOferta();

	}

	@And("^Clique no Botao Permitir Condicao$")
	public void permitirCondicao() throws Throwable {
		telacadastro.AceitarCondicao();
	}

	@Then("^Clique no Botao Resgistrar usuario$")
	public void clique_no_Botao_Resgistrar_usuario() throws Throwable {
		telacadastro.registrarNome();
	}
		@Then("^fechar guia url$")
	public void fechar_guia_url() throws Throwable{
		driver = DriverFactoryBDD.quitDriver();
		
	}

}
