Feature: Cadastro Usuario


Scenario: Login bem-sucedido com credenciais válidas
	Given  Carregamento dos dados
	When Usuario Navegue para pagina Login
	When Usuario crie uma conta
	When Digite seu nome
	When Digite seu email
	When Digite sua senha senha
	When Confirmar sua senha 
	When Digite Primeiro Nome
	When Digite Segundo Nome
	When Digite seu Telefone
	When Escolher Pais
	When Digite sua Cidade
	 When Digite O Endereco
	When Digite Codigo Postal
	When Clique no Botao Permitir Oferta
	When Clique no Botao Permitir Condicao
	Then Clique no Botao Resgistrar usuario 
	








