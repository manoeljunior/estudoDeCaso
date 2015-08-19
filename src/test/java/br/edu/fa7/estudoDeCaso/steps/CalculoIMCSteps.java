package br.edu.fa7.estudoDeCaso.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import br.edu.fa7.estudoDeCaso.pages.CalculoIMCPage;
import br.edu.fa7.estudoDeCaso.utils.SeleniumUtil;

public class CalculoIMCSteps {

	private CalculoIMCPage calculoIMCPage;
	
	@Given("esteja na tela de Cálculo do IMC")
	public void givenEstejaNaTelaDeCálculoDoIMC() {
		calculoIMCPage = new CalculoIMCPage(SeleniumUtil.getDriver());
	}
	
	@When("informar o peso <peso>")
	public void informarOPeso(@Named("peso") double peso) {
		calculoIMCPage.informarPeso(peso);
	}
	
	@When("informar a altura <altura>")
	public void informarAltura(@Named("altura") double altura) {
		calculoIMCPage.informarAltura(altura);
	}
	
	@Then("o IMC calculado é <imc>")
	public void oIMCCalculado(@Named("imc") double imc) {
		calculoIMCPage.calcularIMC();
		Assert.assertEquals(imc, calculoIMCPage.obterIMC(), 0.009);	
	}
	
	@Then("o sistema apresenta a mensagem <mensagem>")
	public void thenOSistemaApresentaAMensagemPesoNormal(@Named("mensagem") String mensagem) {
		Assert.assertEquals(mensagem, SeleniumUtil.obterMensagem());
	}

}
