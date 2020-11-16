package consumidor_agricultor;

import java.util.concurrent.Semaphore;

public class Agricultor extends Thread{

	private Campo campo;
	private Semaphore semaforo = new Semaphore(1);
	
	public Agricultor(Campo campo) 
	{		
		this.campo=campo;
	}
	
	@Override
	public void run() 
	{
		while(true) 
		{	
			try {
				if(campo.getPatatas()>=0 && campo.getPatatas()<100) 
				{
					
					semaforo.acquire();
					System.out.println("\nEl agricultor ha generado "+campo.generaPatatas()+" patatas. Ahora hay "+campo.getPatatas()+".");
					semaforo.release();
					sleep(100);
					//notifyAll();
				}
				else 
				{
					System.out.println("\nEl campo está lleno, el agricultor duerme.");
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
