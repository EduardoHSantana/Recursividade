package controller;

public class MenorValorController {

	public MenorValorController() {
		super();
		
	}
    public int menorValor(int[] vetor, int tamanho, int menor) {
    	//condição de parada
    	if (tamanho == 0) {
    		return menor;
    	} else {
    		if(vetor[tamanho -1] < menor) {
    			menor = vetor[tamanho - 1];
    		}
    		return menorValor(vetor, tamanho - 1, menor);//chamada da função
    	}
    }
}
