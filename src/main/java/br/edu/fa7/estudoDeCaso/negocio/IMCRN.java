package br.edu.fa7.estudoDeCaso.negocio;

public class IMCRN {

	public double calcular(double peso, double altura) {
		if (altura != 0 && peso != 0)
			return peso / (Math.pow(altura, 2));
		else
			throw new IllegalArgumentException();
	}

}
