package tanda2;

import java.util.Scanner;

public class Rectangulo implements Comparable <Rectangulo>, Cloneable {
	
	Scanner s = new Scanner(System.in);

	
	//Atributo
	
	private int ancho;
	private int altura;
	
	//Metodos
	
	
	public Rectangulo (int ancho, int altura) {
		this.ancho = ancho;
		this.altura = altura;
		
	}
	

	public int getAncho() {
		return ancho;
	}
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int perimetro(int ancho, int altura) {
		int perimetro = (2 * ancho) * (2 * altura);
		return perimetro;
	}
	
	public int area (int ancho, int altura) {
		int area = ancho * altura;
		return area;
	}
	
	public int modificarancho(int ancho) {
		System.out.print("Introduce el nuevo ancho: ");
		return ancho = Integer.parseInt(s.nextLine());
	}
	public int modificaralt(int altura) {
		System.out.print("Introduce la nueva altura: ");
		return altura = Integer.parseInt(s.nextLine());
	}
	
	public void dibujar(int ancho, int alura) {
		
		String tapas = "*".repeat(ancho);
		System.out.println(tapas);
		String cuerpo = "*" + " ".repeat(ancho - 2) + "*";
		for(int i = 0; i < (altura - 2); i++) {
		System.out.println(cuerpo);
		}
		System.out.println(tapas);
	}
	
	@Override
	public int compareTo(Rectangulo rectangulo2) {
		return this.ancho * this.altura - rectangulo2.ancho * rectangulo2.altura;
	}
	
	@Override
	public Rectangulo clone() {
		return new Rectangulo (this.ancho, this.altura);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + altura;
		result = prime * result + ancho;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (altura != other.altura)
			return false;
		if (ancho != other.ancho)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", altura=" + altura + "]";
	}
	
	
}
 