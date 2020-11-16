package consumidor_agricultor;

import java.util.concurrent.Semaphore;

public class Consumidor extends Thread{

	private Campo campo;
	private Semaphore semaforo = new Semaphore(1);
	
	public Consumidor(Campo campo) 
	{
		
		this.campo=campo;
	}
	
	@Override
	public void run() 
	{
		while(true) 
		{
			try 
			{
				if(campo.getPatatas()>0) 
				{
					semaforo.acquire();
					System.out.println("\nEl consumidor se ha llevado "+campo.retiraPatatas()+" patatas. Ahora quedan "+campo.getPatatas()+".");
					semaforo.release();
					sleep(100);
					//notifyAll();
				}
				else 
				{
					System.out.println("\nEl campo está vacío, el consumidor duerme.");
					//wait();
					sleep(100);
				}
			}
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
