package br.edu.fa7.estudoDeCaso.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.edu.fa7.estudoDeCaso.negocio.IMCRN;

@ManagedBean (name = "calculoIMCBean")
public class CalculoIMCBean {

	private double peso;
	private double altura;
	private double imc;
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}
	
	public void calcularIMC() {
		IMCRN imcRN = new IMCRN();
		imc = imcRN.calcular(peso, altura);
		if (imc < 17) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "info","Muito abaixo do peso"));
		} else if (imc >= 17 && imc <= 18.49) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "info","Abaixo do peso"));
		} else if (imc >= 18.5 && imc <= 24.99) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "info","Peso normal"));
		} else if (imc >= 30 && imc <= 34.99) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "info","Obesidade I"));
		}
	}
	
}
