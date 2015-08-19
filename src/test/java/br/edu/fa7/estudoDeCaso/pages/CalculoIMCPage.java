package br.edu.fa7.estudoDeCaso.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculoIMCPage extends PageBase {
	
	@FindBy (id = "imcForm:peso")
	private WebElement pesoUsuario;
	
	@FindBy (id = "imcForm:altura")
	private WebElement alturaUsuario;
	
	@FindBy (id = "imcForm:calcularIMC")
	private WebElement botaoCalcularIMC;
	
	@FindBy (id = "imcForm:imc")
	private WebElement imc;
	
	public CalculoIMCPage(WebDriver driver) {
		super(driver);
	}
	
	public void informarPeso(double peso) {
		pesoUsuario.clear();
		pesoUsuario.sendKeys(String.valueOf(peso));	
	}
	
	public void calcularIMC() {
		botaoCalcularIMC.click();
	}

	public double obterIMC() {
		return Double.valueOf(imc.getAttribute("value"));
	}
	
//	public double obterIMC() {
//		WebElement element = driver.findElement(By.id("imcForm:imc"));
//		return Double.valueOf(element.getAttribute("value"));
//	}
//	
	public void informarAltura(double altura) {
		alturaUsuario.clear();
		alturaUsuario.sendKeys(String.valueOf(altura));	
	}

}
