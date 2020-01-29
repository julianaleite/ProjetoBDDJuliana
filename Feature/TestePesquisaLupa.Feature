Feature: Pesquisa Lupa

Scenario: pesquisar produto na lupa 
	Given Carregamento dos dados
	When Clicar na Lupa
	When Escrever na lupa 
	Then Produto Escolhido
