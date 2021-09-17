package modelo;

import java.util.ArrayList;

public class Cotizacion {
	private int consecutivo;
	private Cliente cliente;
	private ArrayList<ProductoEnCotizacion> productos;
	private ArrayList<Descuento> descuentos;
	
	
	public Cotizacion(int pConsecutivo) {
		consecutivo = pConsecutivo;
		productos = new ArrayList<ProductoEnCotizacion>();
		descuentos = new ArrayList<Descuento>();
	}
	
	public int obtenerConsecutivo() {
		return consecutivo;
	}
	
	public void agregarCliente(String nombre, String documento, 
			String telefono, String direccion, String email) {
		cliente = new Cliente(nombre, documento, telefono,direccion,email);
	}
	
	public void agregarProductoConCantidad(Producto productoNuevo, double cantidad) {
		productos.add(new ProductoEnCotizacion(cantidad, productoNuevo));
	}
	
	public double calcularTotal() {
		// Hace falta
		return 0;
	}
	
	public void agregarDescuentos(Descuento descuentoNuevo){
		descuentos.add(descuentoNuevo);
	}
	
	public Cliente obtenerCliente() {
		return cliente;
	}
	
	public ArrayList<ProductoEnCotizacion> obtenerProductos(){
		return productos;
	}
	
	public ArrayList<Descuento> obtenerDescuentos(){
		return descuentos;
	}
}