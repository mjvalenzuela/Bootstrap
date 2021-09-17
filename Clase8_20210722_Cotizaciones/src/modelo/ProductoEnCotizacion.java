package modelo;

public class ProductoEnCotizacion {
	private double cantidad;
	private Producto producto;
	
	public ProductoEnCotizacion(double pCantidad, Producto pProducto) {
		cantidad = pCantidad;
		producto = pProducto;
	}
	
	public Producto obtenerProducto() {
		return producto;
	}
}