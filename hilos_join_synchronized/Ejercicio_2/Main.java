package hilos_join_synchronized.Ejercicio_2;

public class Main {

	public static void main(String[] args) {

		int cont=0;
		
		Hilo h1 = new Hilo(cont);
		Hilo h2 = new Hilo(cont);
		Hilo h3 = new Hilo(cont);
		Hilo h4 = new Hilo(cont);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
		System.out.println(cont);
		
	}

}
