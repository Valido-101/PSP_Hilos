package Prueba_Clase_Thread_Interfaz_Runnable;

public class Hilo_Herencia extends Thread{
	
	public Hilo_Herencia(String nombre)
	{
		super(nombre);
	}
	
	public void run() 
	{
		for(int x=0 ; x<10 ; x++) 
		{
			System.out.println(getName()+" -> "+x);
		}
		
		System.out.println("Fin del hilo "+getName());
	}

}
