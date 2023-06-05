package ar.edu.unlam.polimorfismo;

public class Electrodomestico extends Producto implements Descuento{
	
	public Electrodomestico(String nombre, Integer precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}
	
	public Electrodomestico() {
		
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
