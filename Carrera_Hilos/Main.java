package Carrera_Hilos;

public class Main {

	public static void main(String[] args) {
		
		Corredor c1 = new Corredor("1");
		Corredor c2 = new Corredor("2");
		Corredor c3 = new Corredor("3");
		
		c1.start();
		
		c2.start();
		
		c3.start();
		
	}

}
