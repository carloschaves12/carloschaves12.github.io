package tanda2;

public class Cuadrado extends Rectangulo{
	
	public Cuadrado (int lado) {
		super(lado, lado); /**al poner super le pasamos a la super clase el valor lado */
		}
	
	public int getLado() {
		return this.getAltura();
	}
	
	public void setLado(int lado) {
		super.setAltura(lado);
		super.setAncho(lado);
	}
	
	@Override
	public void setAltura (int altura) {
		this.setLado(altura);
	}
	
	@Override
	public void setAncho (int ancho) {
		this.setLado(ancho);
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + getLado() + "]";
	}
}
