package br.edu.fa7.estudoDeCaso.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import br.edu.fa7.estudoDeCaso.pages.LoginPage;
import br.edu.fa7.estudoDeCaso.utils.SeleniumUtil;

public class LoginSteps {

	private LoginPage loginPage;
	
	@Given("esteja na tela de Login")
	public void apresentarTelaLogin() {
		loginPage = new LoginPage(SeleniumUtil.getDriver());
		loginPage.acessar();
	}
	
	@When("informar o nome $nome")
	public void informarNome(String nome) {
		loginPage.informarNome(nome);
	}
	
	@When("informar a senha $senha")
	public void informarSenha(String senha) {
		loginPage.informarSenha(senha);
	}
	
	@When("efetuar o login")
	public void efetuarOLogin() {
		loginPage.efetuarLogin();
	}
	
	@Then("o sistema apresenta a tela Cálculo do IMC")
	public void oSistemaApresentaATelaCalculoDoIMC() {
		Assert.assertEquals("Cálculo do IMC", SeleniumUtil.obterTitulo());
	}
	
	@Then("o sistema apresenta a mensagem Usuário/senha inválidos")
	public void thenOSistemaApresentaAMensagemUsuáriosenhaInválidos() {
		Assert.assertEquals("Usuário/senha inválidos", SeleniumUtil.obterMensagem());
	}
	
}
