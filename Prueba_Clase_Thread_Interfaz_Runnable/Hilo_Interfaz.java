package Prueba_Clase_Thread_Interfaz_Runnable;

public class Hilo_Interfaz implements Runnable{

	@Override
	public void run() {
		
		for(int x=0 ; x<10 ; x++) 
		{
			System.out.println(Thread.currentThread().getName()+" -> "+x);
		}
		
		System.out.println("Fin del hilo "+Thread.currentThread().getName());
		
	}

}
