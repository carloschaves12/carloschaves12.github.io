package tanda2;

public class Lista {
	
	//Variables de clase
	
	private static final int maxSize = 10;
	
	//Variables de instancia
	
	private int []content; // array donde almacenamos los elementos de la lista
	private int contentSize; // tamaño de la lista (nº de elementos almacenados)
	
	//Metodos
	
	public Lista() {
		this.contentSize = 0;
		this.content = new int [maxSize];
	}
	
	public Lista(int ... elemento) {
		this.contentSize = elemento.length;
		
		if (elemento.length > maxSize) {
			this.content = new int[elemento.length];
		} else {
			this.content = new int[maxSize];
		}
		
		for (int i = 0; i < elemento.length; i++) {
			this.content[i] = elemento[i];
		}
	}
	
	public boolean estaVacia() {
		return this.contentSize == 0;
	}
	
	public boolean estaLlena() {
		return this.contentSize == this.content.length;
	}
	
	public boolean insertar(int elemento) {
		if (estaLlena()) {
			return false;
		}
		
		this.content[this.contentSize] = elemento;
		this.contentSize++;
		return true;
	}
	
	public boolean insertar(int elemento, int posicion) {
		if (estaLlena()) {
			return false;
		}
		
		if (posicion > this.contentSize) {
			this.content[this.contentSize] = elemento;
			return true;
		} else if(posicion < 0) {
			System.err.print("Error");
			return false;
		} else {
			for (int i = this.contentSize - 1; i >= posicion; i--) {
				this.content[i] = this.content[i + 1];
			}
			this.content[posicion] = elemento;
			this.contentSize++;
			return true;
		}
		
	}
	
	public int eliminar() {
		if (estaVacia()) {
			System.err.print("Error");
			return 0;
		} else {
			this.contentSize--;
			return this.content[this.contentSize - 1];
		}
	}
	
	public int eliminar(int posicion) {
		if (estaVacia()) {
			System.err.print("Error");
			return 0;
		}
		
		if (posicion < 0 || posicion > this.contentSize) {
			System.err.print("Error");
			return 0;
		} else {
			this.contentSize--;
			int aux = this.content[posicion];
			for (int i = posicion + 1; i <= this.contentSize ; i++) {
				this.content[i] = this.content[i - 1];
			}
			return aux;
			
		}
	}
	
	public boolean eliminarOcurrencia(int elemento) {
		int i;
		
		if (estaVacia()) {
			return false;
		}
		
		for (i = 0; i < this.contentSize-1 && this.content[i] != elemento; i++) {
			if (this.content[i] != elemento) {
				return false;
			}
		}
				
		for (int j = i; j <= this.contentSize-1 ; j++) {
			this.content[j] = this.content[j + 1];
			this.contentSize --;
			return true;
		}
	}

	public int getContentSize() {
		return contentSize;
	}
	
}
