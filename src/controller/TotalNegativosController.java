package controller;

public class TotalNegativosController {

	public TotalNegativosController() {
		super();
		
	}
    public int totalNegativos(int[] vetor, int tamanho) {
           //condição de parada
           if (tamanho == 0) {
        	   return 0; 
           } else {
        	    int ultimaPosicao = tamanho - 1;
        	    int valor = vetor[ultimaPosicao];
        	    tamanho = tamanho - 1;
        	    if (valor < 0) {
        	    	return 1 + totalNegativos(vetor, tamanho); //chamada da recursiva
        	    } else {
        	    	return 0 + totalNegativos(vetor, tamanho); //chamada da recursiva
        	    }
        	    
           }
}
}
