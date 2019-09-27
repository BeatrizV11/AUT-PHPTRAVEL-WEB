# language: pt

	Funcionalidade:
	
	Contexto: 
		Dado que eu esteja na tela de login
		Quando faço o login com o usuário "admin@phptravels.com" e senha "demoadmin"
	
	@Menu
	Cenário: Itens apresentados no menu Accounts
		Dado que eu esteja na tela Home
		Quando acesso o menu Accounts
		Então são apresentados os itens "Admins", "Suppliers", "Customers" e "Guestcustomers"
	