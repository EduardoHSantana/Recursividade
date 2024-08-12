package view;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fatcontr = new FatorialController();
		    int n = 5;
		    int fatorial = fatcontr.fatorial(n);
            System.out.println(fatorial);
	}

}
