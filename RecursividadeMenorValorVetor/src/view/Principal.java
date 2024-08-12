package view;

import controller.MenorValorController;

public class Principal {

	public static void main(String[] args) {
		int [] vetor = {1, 7, -4, 8, 2, 3};
		MenorValorController menorvalor = new MenorValorController();
		int tamanho = vetor.length;
		int resultado = menorvalor.menorValor(vetor, tamanho, vetor[tamanho - 1]);
		System.out.println(resultado);
		
	}

}
