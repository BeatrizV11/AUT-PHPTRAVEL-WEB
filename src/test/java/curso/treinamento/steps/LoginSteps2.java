package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;

public class LoginSteps2 {
	
	private LoginPage loginPage = new LoginPage (Hooks.getDriver());
	private HomePage homePage = new HomePage (Hooks.getDriver());
	
	@Dado("que eu esteja na tela de login")
	public void que_eu_deseje_logar_no_sistema() throws InterruptedException {
		
		//Thread.sleep(3000);
		Assert.assertTrue("Página Login não foi apresentada", loginPage.validar_pagina());
		
	}

	@Quando("faço o login com o usuário {string} e senha {string}")
	public void faço_o_login_com_o_usuário_e_senha(String user, String pass) {
		
		loginPage.preencher_email(user);
		loginPage.preencher_password(pass);
		loginPage.clicar_botao_login();
	}

	@Então("sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() throws InterruptedException {
	
		//Thread.sleep(3000);
		Assert.assertTrue("Página Principal não encontrada", homePage.validar_pagina());
		
	}

	@Então("é apresentada a mensagem \"The Email field must contain a valid email address.\"")
	public void é_apresentada_a_mensagem()  {
		
		Assert.assertTrue("Mensagem de email inválido não apresentada", loginPage.validar_email_invalido());
	}	
}
