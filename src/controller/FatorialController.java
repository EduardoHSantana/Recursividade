package controller;

public class FatorialController {

	public FatorialController() {
		super();
		
	}
    public int fatorial(int n) {
    	//condição de parada
    	if (n == 1) {
    		return 1;
    	} else {
            int valor = n;
            n = n - 1;
    		return valor * fatorial(n); //chamada da recursiva
    	}
    	
    }
}
