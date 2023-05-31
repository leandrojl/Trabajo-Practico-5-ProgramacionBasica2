package ar.edu.unlam.polimorfismo;

import java.util.ArrayList;

public class CarroDeCompras {
	
	private ArrayList<Producto> productos;
	
	public CarroDeCompras() {
		this.productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
		
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

}
