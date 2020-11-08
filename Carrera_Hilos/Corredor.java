package Carrera_Hilos;

public class Corredor extends Thread{
	
	public Corredor(String nombre) 
	{
		super(nombre);
	}

	public void run() 
	{
		for(int x=0;x<=20;x++) 
		{
			System.out.println(this.getName()+"x"+x+" ");
		}
		
		System.out.println("Fin del hilo "+this.getName());
		
	}
	
}
