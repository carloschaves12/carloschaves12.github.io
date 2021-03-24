package tanda2;

import java.util.Scanner;

public class testrectangulo {
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		
		//
		
		System.out.print("Introduce el ancho del rectangulo: ");
		int ancho = Integer.parseInt(s.nextLine());
		while (ancho <= 0) {
			System.out.println("El dato introducido no es valido");
			System.out.print("Introduce el ancho del rectangulo: ");
			ancho = Integer.parseInt(s.nextLine());
		}
		
		System.out.print("Introduce la altura del rectangulo: ");
		int altura = Integer.parseInt(s.nextLine());
		while (altura <= 0 | altura == ancho) {
			System.out.println("El dato introducido no es valido");
			System.out.print("Introduce la altura del rectangulo: ");
			altura = Integer.parseInt(s.nextLine());		
		}
		
		Rectangulo rectangulo1 = new Rectangulo(ancho, altura);

		
		System.out.println("El ancho del rectangulo es: " + ancho);
		System.out.println("La altura del rectangulo es: " + altura);
		
		System.out.println("El perímetro del rectangulo es: " + rectangulo1.perimetro(ancho, altura));
		
		System.out.println("El área del rectangulo es: " + rectangulo1.area(ancho, altura));
		
		
		System.out.println("El nuevo ancho es: " + rectangulo1.modificarancho(ancho));
		
		System.out.println("La nueva altura es: " + rectangulo1.modificaralt(altura));

		rectangulo1.dibujar(ancho, altura);
		
		System.out.print("Introduce la altura de rectangulo que quieres comparar: ");
		int newaltura = Integer.parseInt(s.nextLine());
		System.out.print("Introduce el ancho del rectangulo que quieres comparar: ");
		int newancho = Integer.parseInt(s.nextLine());
		
		Rectangulo rectangulo2 = new Rectangulo(newancho, newaltura);

				
		if(rectangulo1.compareTo(rectangulo2) > 0) {
			System.out.print("El primer rectangulo es mayor que el segundo");
		}
		else if(rectangulo1.compareTo(rectangulo2) == 0) {
			System.out.print("El primer rectangulo es igual que el segundo");
		}
		if(rectangulo1.compareTo(rectangulo2) < 0) {
			System.out.print("El primer rectangulo es menor que el segundo");
		}
	}

}
