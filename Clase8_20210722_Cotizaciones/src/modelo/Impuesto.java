package modelo;

public class Impuesto {
	private String nombre;
	private double porcentaje;
	
	public Impuesto(String pNombre, double pPorcentaje) {
		nombre = pNombre;
		porcentaje = pPorcentaje;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public double obtenerPorcentaje() {
		return porcentaje;
	}
}