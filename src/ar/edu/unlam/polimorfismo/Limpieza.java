package ar.edu.unlam.polimorfismo;

public class Limpieza extends Producto implements Descuento{

	public Limpieza(String nombre, Integer precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}
	
	public Limpieza() {
		
	}
	
	@Override
	public Integer aplicarDescuento() {
		// Si se compran X cantidad de alimentos hay descuento
		return null;
	}

	@Override
	public Integer calcularPrecio() {
		// TODO Auto-generated method stub
		return null;
	}
}
