package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;

public class VisualizacaoMenuSteps {
	
	@Dado("que eu esteja na tela Home")
	public void que_eu_esteja_na_tela_Home() {
	  
		Assert.assertTrue("Página Principal não encontrada", HomePage.validar_pagina());  
	}

	@Quando("acesso o menu Accounts")
	public void acesso_o_menu_Accounts() {
		
		HomePage.clicarBtnAccounts();
		//Assert.assertTrue("Menu Accounts não encontrado", HomePage.validar_menu_accounts());
	}

	@Então("são apresentados os itens {string}, {string}, {string} e {string}")
	public void são_apresentados_os_itens_e(String string, String string2, String string3, String string4) {
	
		Assert.assertTrue("Botão Admins não encontrado", HomePage.validar_btn_admins());
		Assert.assertTrue("Botão Suppliers não encontrado", HomePage.validar_btn_suppliers());
		Assert.assertTrue("Botão Customers não encontrado", HomePage.validar_btn_customers());
		Assert.assertTrue("Botão GuestCustomers não encontrado", HomePage.validar_btn_guestcustomers());
		
	}    
}
