#language: pt
Feature: Cadastro Login

Scenario: Login bem-sucedido com credenciais válidas
	Given  Carregamento dos dados
	When o usuário navega para a página de login
	And o usuário navega para a página de logon
	Then Mensagem exibida Login com êxito


Scenario: Login bem - sucedido
	When O Login do Usuario do aplicativo
	Then Mensagem exibida login com sucesso





