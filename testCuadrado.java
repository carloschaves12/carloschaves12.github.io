package tanda2;

import java.util.Scanner;

public class testCuadrado {
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el valor del lado: ");
		int lado = Integer.parseInt(s.nextLine());
		
		Cuadrado cuadrado1 = new Cuadrado(lado);
		
		cuadrado1.getLado();
		cuadrado1.setLado(lado);
		
		System.out.println(cuadrado1);
		
		System.out.println("Introduce el valor de la altura del cuadrado: ");
		int altura = Integer.parseInt(s.nextLine());
		cuadrado1.setAltura(altura);
		
		System.out.println(cuadrado1);
		
		System.out.println("Introduce el valor del ancho del cuadrado: ");
		int ancho = Integer.parseInt(s.nextLine());
		cuadrado1.setAncho(ancho);
		
		System.out.println(cuadrado1);
	}
}
