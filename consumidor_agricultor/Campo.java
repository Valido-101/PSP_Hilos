package consumidor_agricultor;

public class Campo {

	private int patatas;
	
	public Campo() 
	{
		patatas=0;
	}
	
	public int generaPatatas() 
	{
		int n_patatas_generadas = (int)(Math.random()*(100-patatas)+1);
		
		if(patatas+n_patatas_generadas<=100) 
		{
			patatas += n_patatas_generadas;
			return n_patatas_generadas;
		}
		else 
		{
			patatas=100;
			return n_patatas_generadas;
		}
	} 
	
	public int retiraPatatas() 
	{
		int cantidad = (int)(Math.random()*patatas+1);
		
		if(patatas-cantidad>=0) 
		{
			patatas-=cantidad;
			return cantidad;
			
		}else 
		{
			patatas=0;
			return cantidad;
		}
		
	}

	public int getPatatas() {
		return patatas;
	}

	public void setPatatas(int patatas) {
		this.patatas = patatas;
	}
	
	
}
