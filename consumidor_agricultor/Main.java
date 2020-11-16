package consumidor_agricultor;

public class Main {

	public static void main(String[] args) {
		
		Campo campo = new Campo();
		Agricultor agricultor = new Agricultor(campo);
		Consumidor consumidor = new Consumidor(campo);
		
		agricultor.start();
		consumidor.start();
	}

}
