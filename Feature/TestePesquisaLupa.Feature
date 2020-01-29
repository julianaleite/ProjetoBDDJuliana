Feature: Pesquisa Lupa

Scenario: pesquisar produto na lupa 
	Given Carrega driverfactory
	When Clicar na Lupa
	When Escrever na lupa 
	Then Produto Escolhido
