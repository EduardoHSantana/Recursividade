package view;

import controller.SomatoriaSequenciaController;

public class Principal {

	public static void main(String[] args) {
		SomatoriaSequenciaController somatoriacontr = new SomatoriaSequenciaController();
		double n = 5;
		double soma = somatoriacontr.somatoriaSequencia(n);
		System.out.println(soma);

	}

}
