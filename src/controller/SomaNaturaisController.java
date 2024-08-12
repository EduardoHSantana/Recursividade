package controller;

public class SomaNaturaisController {

	public SomaNaturaisController() {
		super();
		
	}
	public int somaNaturais(int n) {
		//condição de parada
		if (n <= 0) {
			return 0;
			
		} else {
			int valor = n;
			n = n - 1;
			return valor + somaNaturais(n);	//chamada da função
		}
	}
	

}
