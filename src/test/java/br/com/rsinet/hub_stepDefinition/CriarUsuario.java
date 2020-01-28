package br.com.rsinet.hub_stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import br.com.rsinet.hub_Pages.*;

public class CriarUsuario {

	PagCadastro telacadastro;

	public static WebDriver driver;

	@Given("^Carregamento dos dados$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");
	}

	@When("^User Navigate to LogIn Page$")
	public void login_Page() throws Throwable {
		driver.findElement(By.id("menuUser")).click();
	}

	@When("^User Navigate to LogIn Page$")
	public void criar_Conta() throws Throwable {
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();

	}

	@When("usar nome ")
	public void nome() throws Throwable {
		String nome = "Juliana";
		telacadastro.digitaNome(nome);

	}

	@When("Digitar email ")
	public void emailDigitado() throws Throwable {
		String email = "juliana.silva@teste.com.br";
		telacadastro.digitaNome(email);

	}

	@When("Digitar senha ")
	public void senhaDigitada() throws Throwable {
		String senha = "1213Ju";
		telacadastro.digitaNome(senha);
	}

	@When("Confirmar senha ")
	public void confirmeSenha() throws Throwable {
		String confirSenha = "1213Ju";
		telacadastro.digitaNome(confirSenha);
	}

	@When("Digitar Primeiro Nome")
	public void DigitePrimeiroNome() throws Throwable {
		String primeiroNome = "juliana";
		telacadastro.digitaNome(primeiroNome);
	}

	@When("Digitar segundo nome")
	public void digitarSegundoNome() throws Throwable {
		String segundoNome = "Silva";
		telacadastro.digitaNome(segundoNome);
	}

	@When("Digitar Telefone ")
	public void digitaFone() throws Throwable {
		String telefone = "987654321";
		telacadastro.digitaNome(telefone);
	}

	@When("Escolher Pais  ")
	public void EscolhaPais() throws Throwable {
		String pais = "Brazil";
		telacadastro.digitaNome(pais);
	}

	@When("Digitar Cidade ")
	public void digiteCidade() throws Throwable {
		String cidade = "Barueri";
		telacadastro.digitaNome(cidade);
	}

	@When("Digitar Endereco ")
	public void digiteEndereco() throws Throwable {
		String endereco = "rua mar do teste";
		telacadastro.digitaNome(endereco);
	}

	@When("Digitar Codigo Postal ")
	public void digiteCodigo() throws Throwable {
		String codigo = "654321";
		telacadastro.digitaNome(codigo);
	}

	@When("Botao Permitir Oferta ")
	public void permitirOferta() throws Throwable {
		telacadastro.permitirOferta();

	}

	@When("Botao Permitir Condicao")
	public void permitirCondicao() throws Throwable {
		telacadastro.AceitarCondicao();
	}

	@Then("Botao Resgistrar usuario ")
	public void registrarUsuario() throws Throwable {
		telacadastro.registrarNome();
	}

}
