Feature: Cadastro Usuario

@CadastraUsuario
Scenario: Login bem-sucedido com credenciais validas
	Given  Carrega os dados
	When Usuario Navegue para pagina Login
	And Usuario crie uma conta
	And Digite seu nome
	And Digite seu email
	And Digite sua senha senha
	And Confirmar sua senha
	And Digite Primeiro Nome
	And Digite Segundo Nome
	And Digite seu Telefone
	And Escolher Pais
	And Digite sua Cidade
	And Digite O Endereco
	And Digite Codigo Postal
	And Clique no Botao Permitir Oferta
	And Clique no Botao Permitir Condicao
	Then Clique no Botao Resgistrar usuario
	Then fechar guia url
	
	
	
	
	
	

	
	
