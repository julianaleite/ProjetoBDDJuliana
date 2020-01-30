Feature: Pesquisa Lupa

@PesquisaLupa
Scenario: pesquisar produto na lupa 
	Given Carrega driverfactory
	When Clicar na Lupa
	And Escrever na lupa 
	Then Produto Escolhido

