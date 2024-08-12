package view;

import controller.SomaNaturaisController;

public class Principal {

	public static void main(String[] args) {
		SomaNaturaisController somacontr = new SomaNaturaisController();
		int n = -3;
		int soma = somacontr.somaNaturais(n);
		System.out.println(soma);
		

	}

}
