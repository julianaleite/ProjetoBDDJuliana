package br.com.rsinet.hub_stepDefinition;


import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.utility.DriverFactoryBDD;
import br.com.rsinet.hub_Pages.PagCadastro;
import br.com.rsinet.hub_Pages.PagInicial;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CriarUsuario {

	PagCadastro telacadastro;
	PagInicial telalogin;

	public static WebDriver driver;

	@Given("^Carregamento dos dados$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = DriverFactoryBDD.getDriver();
	}
	@When("^Usuario Navegue para pagina Login$")
	public void login_Page() throws Throwable {
		telalogin.CriarLogin();
	}
	

	@When("Usuario crie uma conta")
	public void criar_Conta() throws Throwable {
		telalogin.criarConta();

	}

	@When("^Digite seu nome$")
	public void digite_seu_nome() throws Throwable {
		String nome = "Juliana";
		telacadastro.digitaNome(nome);

	}

	@When("^Digite seu email$")
	public void digite_seu_email() throws Throwable {
		String email = "juliana.silva@teste.com.br";
		telacadastro.digitaNome(email);

	}

	@When("^Digite sua senha senha$")
	public void digite_sua_senha_senha() throws Throwable {
		String senha = "1213Ju";
		telacadastro.digitaNome(senha);
	}

	@When("^Confirmar sua senha$")
	public void confirmar_sua_senha() throws Throwable {
		String confirSenha = "1213Ju";
		telacadastro.digitaNome(confirSenha);
	}

	@When("^Digite Primeiro Nome$")
	public void digite_seu_Primeiro_Nome() throws Throwable {
		String primeiroNome = "juliana";
		telacadastro.digitaNome(primeiroNome);
	}

	@When("^Digite Segundo Nome$")
	public void digite_seu_Segundo_Nome() throws Throwable {
		String segundoNome = "Silva";
		telacadastro.digitaNome(segundoNome);
	}

	@When("^Digite seu Telefone$")
	public void digite_seu_Telefone() throws Throwable {
		String telefone = "987654321";
		telacadastro.digitaNome(telefone);
	}

	@When("^Escolher Pais$")
	public void escolher_Pais() throws Throwable {
		String pais = "Brazil";
		telacadastro.digitaNome(pais);
	}

	@When("^Digite sua Cidade$")
	public void digite_sua_Cidade() throws Throwable {
		String cidade = "Barueri";
		telacadastro.digitaNome(cidade);
	}

	@When("^Digite O Endereco$")
	public void digite_seu_Endereco() throws Throwable {
		String endereco = "Rua mar do teste";
		telacadastro.digitaNome(endereco);
	}

	@When("^Digite Codigo Postal$")
	public void digite_Codigo_Postal() throws Throwable {
		String codigo = "654321";
		telacadastro.digitaNome(codigo);
	}

	@When("^Clique no Botao Permitir Oferta$")
	public void clique_no_Botao_Permitir_Oferta() throws Throwable {
		telacadastro.permitirOferta();

	}

	@When("^Clique no Botao Permitir Condicao$")
	public void permitirCondicao() throws Throwable {
		telacadastro.AceitarCondicao();
	}

	@Then("^Clique no Botao Resgistrar usuario$")
	public void clique_no_Botao_Resgistrar_usuario() throws Throwable {
		telacadastro.registrarNome();
	}

}
