package view;

import controller.ContaParesController;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {4, 8, 12, 5, 3, 7, 10, 7, 9, 1, 2};
		int tamanho = vetor.length;
		ContaParesController contcontr = new ContaParesController();
		int resultado = contcontr.contaPares(vetor, tamanho);
		System.out.println(resultado);

	}

}
