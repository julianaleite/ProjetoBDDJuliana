package br.com.rsinet.hub_stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_Steps {	
	@Given("^Carregamento dos dados$")
	public void carregandoDados (){
		System.out.println("Carregando os Dados");
	}	
	@When("^Usuario Navegue para pagina Login$")
	public void navegarLogin(){
		System.out.println(" usuario Navegando para pagina Login");
	}	
	@When("^Usuario crie uma conta$")
	public void criarNovaConta (){
		System.out.println("Usuario criando conta");
	}
	@When("^Digite seu nome$")
	public void digitandoNome (){
		System.out.println("Usuario digitando Nome");
}
	@When("^Digite seu email$")
	public void digitandoEmail (){
		System.out.println("Usuario digitando Email");
}
	@When("^Digite sua senha senhae$")
	public void digitandoSenha (){
		System.out.println(" Usuario Digitando senha");
}
	@When("^Confirmar sua senha$")
	public void confirmandoSenha (){
		System.out.println(" Usuario Confirmar senha");
}
	@When("^Digite Primeiro Nome$")
	public void digitandoPrimeiroNome (){
		System.out.println(" Usuario Digitando Primeiro Nome");
	
}
	@When("^Digite Segundo Nome$")
	public void digitandoSegundoNome (){
		System.out.println(" Usuario Digitando Segundo Nome");
}
	@When("^Digite Segundo Nome$")
	public void digitandoSegundoNome (){
		System.out.println(" Usuario Digitando Segundo Nome");
}