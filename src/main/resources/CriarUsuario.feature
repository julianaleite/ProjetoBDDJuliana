#language: pt
Feature: Cadastro Login

Scenario: Login bem-sucedido com credenciais v�lidas
	Given  Carregamento dos dados
	When o usu�rio navega para a p�gina de login
	And o usu�rio navega para a p�gina de logon
	Then Mensagem exibida Login com �xito


Scenario: Login bem - sucedido
	When O Login do Usuario do aplicativo
	Then Mensagem exibida login com sucesso





