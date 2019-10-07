package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;

public class VisualizacaoMenuSteps {
	
	HomePage homepage = new HomePage(Hooks.getDriver());
	MenuPage menupage = new MenuPage(Hooks.getDriver());
	
	@Dado("que eu esteja na tela Home")
	public void que_eu_esteja_na_tela_Home() {
	  
		Assert.assertTrue("Página Principal não encontrada", HomePage.validar_pagina());  
	}

	@Quando("acesso o menu Accounts")
	public void acesso_o_menu_Accounts() {
		
		MenuPage.clicar_btn_accounts();
		//Assert.assertTrue("Menu Accounts não encontrado", HomePage.validar_menu_accounts());
	}

	@Então("são apresentados os itens {string}, {string}, {string} e {string}")
	public void são_apresentados_os_itens_e(String string, String string2, String string3, String string4) {
	
		Assert.assertTrue("Botão Admins não encontrado", MenuPage.validar_btn_admins());
		Assert.assertTrue("Botão Suppliers não encontrado", MenuPage.validar_btn_suppliers());
		Assert.assertTrue("Botão Customers não encontrado", MenuPage.validar_btn_customers());
		Assert.assertTrue("Botão GuestCustomers não encontrado", MenuPage.validar_btn_guestcustomers());
		
	}    
}
