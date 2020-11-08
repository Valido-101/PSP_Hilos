package hilos_join_synchronized.Ejercicio_1;

public class Main {

	public static void main(String[] args) {
		
		Hilo h1 = new Hilo(1,2,"Suma");
		Hilo h2 = new Hilo(1,2,"Multiplicacion");
		Hilo h3 = new Hilo(1,2,"Potencia");
		
		h1.start();
		
		try {
			h1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		h2.start();
		h3.start();

	}

}
