package ar.edu.unlam.polimorfismo;

public class Lacteo extends Producto implements Descuento{

	public Lacteo(String nombre, Integer precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}
	
	public Lacteo() {
		
	}

	@Override
	public Integer aplicarDescuento() {
		// Si se compran X cantidad de alimentos hay descuento
		return null;
	}

}
