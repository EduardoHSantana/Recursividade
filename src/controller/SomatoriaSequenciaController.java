package controller;

public class SomatoriaSequenciaController {

	public SomatoriaSequenciaController() {
		super();
		
	}
    public double somatoriaSequencia(double n) {
          //condiçao de parada
          if(n == 1) {
        	  return 1;
          } else {
        	  return 1 / n + somatoriaSequencia(n - 1);
          }
}
}