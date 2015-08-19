package br.edu.fa7.estudoDeCaso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	
	@FindBy (id = "loginForm:nome")
	WebElement nomeUsuario;
	
	@FindBy (id = "loginForm:senha")
	WebElement senhaUsuario;
	
	@FindBy (id = "loginForm:logar")
	WebElement botaoLogar;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void acessar() {
		driver.get("http://localhost:8080/login.xhtml");
	}
	
	public void informarNome(String nome) {
		nomeUsuario.clear();
		nomeUsuario.sendKeys(nome);
	}

	public void informarSenha(String senha) {
		senhaUsuario.clear();
		senhaUsuario.sendKeys(senha);
	}

	public void efetuarLogin() {
		botaoLogar.click();
	}
	
}
