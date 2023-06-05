package ar.edu.unlam.polimorfismo;

public class Producto {
	
	String nombre;
	String marca;
	Integer precio;
	
	public Producto(String nombre, Integer precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	

}
