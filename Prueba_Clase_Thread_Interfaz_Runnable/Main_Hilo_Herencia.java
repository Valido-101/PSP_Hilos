package Prueba_Clase_Thread_Interfaz_Runnable;

public class Main_Hilo_Herencia {

	public static void main(String[] args) {
		
		Hilo_Herencia hilo0 = new Hilo_Herencia("Hilo0");
		Hilo_Herencia hilo1 = new Hilo_Herencia("Hilo1");
		Hilo_Herencia hilo2 = new Hilo_Herencia("Hilo2");
		
		System.out.println("Inicio de hilos\n");
		hilo0.start();
		hilo1.start();
		hilo2.start();

	}

}
