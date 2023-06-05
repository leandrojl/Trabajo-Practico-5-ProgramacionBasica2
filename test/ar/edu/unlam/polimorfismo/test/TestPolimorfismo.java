package ar.edu.unlam.polimorfismo.test;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.polimorfismo.CarroDeCompras;
import ar.edu.unlam.polimorfismo.Electrodomestico;
import ar.edu.unlam.polimorfismo.Lacteo;
import ar.edu.unlam.polimorfismo.Limpieza;
import ar.edu.unlam.polimorfismo.Producto;

public class TestPolimorfismo {
	
	/*
	 *  Implementar un carrito de compras, que nos sirva para implementar en cualquier negocio, y
		buscando asemejarlo lo más posible a la realidad. Es decir, cuando nosotros vamos al
		supermercado, en el carrito podemos poner un objeto de tipo leche o muchos de ese mismo
		tipo. Luego, al llegar a la caja, se visualiza la cantidad que hemos comprado de cada producto
		que sean iguales y si llegara a haber un descuento por cantidad, se debe aplicar dicho
		descuento. No olvides desarrollar las pruebas que garanticen el correcto funcionamiento. Para
		eso tené en cuenta verificar compras individuales, por cantidad, con y sin descuentos.
	 * */
	
	@Test
	public void queSePuedaCrearUnCarritoDeCompras() {
		CarroDeCompras carrito = new CarroDeCompras();
		
		
		Assert.assertNotNull(carrito);
	}
	
	@Test
	public void queSePuedaCrearUnProducto() {
		Producto producto = null;
		
		Assert.assertNull(producto);
	}
	
	@Test
	public void queSePuedaGuardarUnProductoEnElCarrito() {
		CarroDeCompras carrito = new CarroDeCompras();
		Producto producto = new Limpieza();
		
		carrito.agregarProducto(producto);
		
		Assert.assertTrue(carrito.getProductos().contains(producto));
	}
	
	@Test
	public void queSePuedaGuardarUnProductoLacteoEnElCarrito() {
		CarroDeCompras carrito = new CarroDeCompras();
		Lacteo producto = new Lacteo();
		
		carrito.agregarProducto(producto);
		
		Assert.assertTrue(carrito.getProductos().contains(producto));
	}
	@Test
	public void queSePuedanCrearYGuardarDistintosProductosEnElCarrito() {
		CarroDeCompras carrito = new CarroDeCompras();
		Producto producto = new Lacteo();
		Producto producto1 = new Limpieza();
		Producto producto2 = new Electrodomestico();
		
		carrito.agregarProducto(producto);
		carrito.agregarProducto(producto1);
		carrito.agregarProducto(producto2);
		
		Assert.assertTrue(carrito.getProductos().size() == 3);
	}

}
