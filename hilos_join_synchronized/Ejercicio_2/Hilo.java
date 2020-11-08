package hilos_join_synchronized.Ejercicio_2;

public class Hilo extends Thread{

	int cont;
	
	public Hilo(int cont) 
	{
		this.cont=cont;
	}
	
	public synchronized void run() 
	{
		int veces=1;
		
		while(veces<=5000) 
		{
			cont++;
			veces++;
		}
	}
	
}
