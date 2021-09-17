package modelo;

public class Descuento {
	private String nombre;
	private double porcentaje;
	
	public Descuento(String pNombre, double pPorcentaje) {
		nombre = pNombre;
		porcentaje = pPorcentaje;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public double obtenerPorcentaje() {
		return porcentaje;
	}
	
	public void actualizarNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public void actualizarPorcentaje(double nuevoPorcentaje) {
		porcentaje = nuevoPorcentaje;
	}
}