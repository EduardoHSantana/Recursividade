

package view;

import controller.TotalNegativosController;

public class Principal {

	public static void main(String[] args) {
		int [] vetor = {5, -7, 2, 3, -1, -87, 59, 22, -1, 0};
		TotalNegativosController totalcontr = new TotalNegativosController();
		int tamanho = vetor.length;
		int resultado = totalcontr.totalNegativos(vetor, tamanho);
		System.out.println(resultado);
	}

}
