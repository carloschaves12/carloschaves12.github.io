package tanda2;


public class Dado {
	
	// Atributos
	
	private int cara;
	
	// Metodos
	
	public Dado() { 	
		this.lanzarDado();
	}
	
	public int getCara(int Cara) {
		return Cara;
	}

	public int lanzarDado () {
		return this.cara = 1 + (int)(Math.random() * 6);
	}
}
