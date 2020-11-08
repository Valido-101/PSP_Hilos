package Prueba_Clase_Thread_Interfaz_Runnable;

public class Main_Hilo_Interfaz {

	public static void main(String[] args) {
		
		Hilo_Interfaz h0 = new Hilo_Interfaz();
		Thread hilo0 = new Thread(h0, "Hilo0");
		Hilo_Interfaz h1 = new Hilo_Interfaz();
		Thread hilo1 = new Thread(h1,"Hilo1");
		Hilo_Interfaz h2 = new Hilo_Interfaz();
		Thread hilo2 = new Thread(h2,"Hilo2");

		System.out.println("Inicio de hilos\n");
		hilo0.start();
		hilo1.start();
		hilo2.start();
		
	}

}
