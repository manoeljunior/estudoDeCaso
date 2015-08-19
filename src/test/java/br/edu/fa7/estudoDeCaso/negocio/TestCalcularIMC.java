package br.edu.fa7.estudoDeCaso.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalcularIMC {

	@Test
	public void deveCalcularIMCValido() {
		double peso = 75D;
		double altura = 1.80;
		
		IMCRN imcRN = new IMCRN();
		assertEquals(23.14, imcRN.calcular(peso, altura), 0.009);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void deveLancarArgumentExceptionQuandoAlturaIgualAZero() {
		double peso = 75D;
		double altura = 0.0;
		
		IMCRN imcRN = new IMCRN();
		imcRN.calcular(peso, altura);
		fail();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void deveLancarArgumentExceptionQuandoPesoIgualAZero() {
		double peso = 0.0;
		double altura = 1.70;
		
		IMCRN imcRN = new IMCRN();
		imcRN.calcular(peso, altura);
		fail();
	}

}
